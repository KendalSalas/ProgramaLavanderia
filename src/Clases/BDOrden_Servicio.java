package Clases;

import static Clases.BDComuna.cbm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Clase encargada de realizar las modificaciones a la tabla "Orden_Servicio"
 *
 * @author Kendall
 */
public class BDOrden_Servicio {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;

    /**
     * Metodo para guardar un registro en la tabla "Orden_Servicio" con sus
     * respectivos datos
     *
     * @param idCliente
     * @param idVendedor
     * @param idEstado
     * @param fechaRec
     * @param fechaDev
     * @return
     */
    public int insertar(int idCliente, int idVendedor, int idEstado, String fechaRec, String fechaDev) {
        int resultado = 0;

        Connection con = null;

        String SQL = ("INSERT INTO orden_servicio (id_cliente, id_vendedor, id_estado, fecha_rec, fecha_dev)"
                + "VALUES (?, ?, ?, ?, ?)");

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idCliente);
            ps.setInt(2, idVendedor);
            ps.setInt(3, idEstado);
            ps.setString(4, fechaRec);
            ps.setString(5, fechaDev);

            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la informacion" + e, "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    /**
     * Metodo para buscar todos los registros existentes en la tabla
     * "Orden_Servicio"
     *
     * @param tabla
     */
    public void buscar(JTable tabla) {

        DefaultTableModel ModeloTabla;

        String[] columnas = {"Id", "Cliente", "Vendedor", "Estado", "Recepcion", "Entrega"};
        String[] registros = new String[6];
        ModeloTabla = new DefaultTableModel(null, columnas);

        String SQL = "";
        Connection conn = null;

        SQL = "SELECT * FROM orden_servicio";

        try {

            conn = Conexion.getConexion();
            PreparedStatement st = conn.prepareStatement(SQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("id_orden");
                registros[1] = rs.getString("id_cliente");
                registros[2] = rs.getString("id_vendedor");
                registros[3] = rs.getString("id_estado");
                registros[4] = rs.getString("fecha_rec");
                registros[5] = rs.getString("fecha_dev");

                ModeloTabla.addRow(registros);
            }

            tabla.setModel(ModeloTabla);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para modificar un registro ya existente en la tabla
     * "Orden_Servicio"
     *
     * @param idCliente
     * @param idVendedor
     * @param idEstado
     * @param fechaRec
     * @param id
     */
    public void modificar(int idCliente, int idVendedor, int idEstado, String fechaRec, String id) {
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

        if (confirmar == JOptionPane.YES_OPTION) {

            Connection con = null;

            try {

                con = Conexion.getConexion();

                String sql = "UPDATE orden_servicio SET id_cliente = ?, id_vendedor = ?, id_estado = ?, fecha_rec = ?"
                        + "WHERE  id_orden = ?";

                PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1, idCliente);
                pst.setInt(2, idVendedor);
                pst.setInt(3, idEstado);
                pst.setString(4, fechaRec);
                pst.setString(5, id);

                if (pst.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "Los datos han sido modificados exitosamente", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido realizar la operacion", "Operacion Fallida", JOptionPane.ERROR_MESSAGE);

                }

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualizacion de los datos" + "Error: " + e, "Error en la operacion", JOptionPane.ERROR_MESSAGE);

            }

        }
    }

    /**
     * Metodo para eliminar un registro ya existente en la tabla
     * "Orden_Servicio"
     *
     * @param id
     */
    public void eliminar(String id) {

        Connection con = null;

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");

        if (confirmar == JOptionPane.OK_OPTION) {

            try {

                String sql = "DELETE FROM orden_servicio "
                        + "WHERE id_orden = ? ";

                con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, id);

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "El registro se ha eliminado correctamente", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro \nIntentelo nuevamente", "Operacion Fallida", JOptionPane.ERROR_MESSAGE);

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro \nIntentelo nuevamente", "Operacion Fallida", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    /**
     * Metodo para llenar un combobox con los datos de la tabla "Orden_Servicio"
     *
     * @param cb
     */
    public static void obtenerOrdenServicio(JComboBox cb) {
        cbm = new DefaultComboBoxModel();

        String sql = "SELECT * FROM orden_servicio";

        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione una Orden");
            while (rs.next()) {
                cbm.addElement(new Orden_Servicio(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
