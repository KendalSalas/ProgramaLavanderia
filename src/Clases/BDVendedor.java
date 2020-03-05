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
 * Clase encargada de realizar las modificaciones a la tabla "Vendedor"
 *
 * @author Kendall
 */
public class BDVendedor {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;

    /**
     * Metodo encargado de INSERTAR un registro en la tabla "Vendedor"
     *
     * @param rut
     * @param rutVend
     * @param nombre
     * @param apePat
     * @param apeMat
     * @param idSuc
     * @param correo
     * @param telefono
     * @return
     */
    public int insertar(int rut, int rutVend, String nombre, String apePat, String apeMat, int idSuc, String correo, int telefono) {
        int resultado = 0;

        Connection con = null;
        String SQL = "INSERT INTO vendedor (rut_vendedor, rut_veri, nombre_vendedor, apellido_paterno_vendedor, apellido_materno_vendedor, "
                + "id_suc, correo_vendedor, telefono_vendedor)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, rut);
            ps.setInt(2, rutVend);
            ps.setString(3, nombre);
            ps.setString(4, apePat);
            ps.setString(5, apeMat);
            ps.setInt(6, idSuc);
            ps.setString(7, correo);
            ps.setInt(8, telefono);

            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la informacion" + e, "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    /**
     * Metodo para buscar un registro ya existente en la tabla "Vendedor",
     * filtrando según desee el usuario
     *
     * @param valor
     * @param filtro
     * @param tabla
     */
    public void buscar(String valor, String filtro, JTable tabla) {

        DefaultTableModel ModeloTabla;

        String[] columnas = {"Id", "Rut", "Verificador", "Nombre", "Apellido Paterno", "Apellido Materno", "Sucursal", "Correo", "Telefono"};
        String[] registros = new String[9];
        ModeloTabla = new DefaultTableModel(null, columnas);

        String SQL;
        Connection conn = null;

        if (filtro.equals("Nombres")) {

            SQL = "SELECT * FROM vendedor WHERE nombre_vendedor LIKE '%" + valor + "%'";
        } else {

            SQL = "SELECT * FROM vendedor WHERE id_suc LIKE '%" + valor + "%'";

        }

        try {

            conn = Conexion.getConexion();
            PreparedStatement st = conn.prepareStatement(SQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("id_vendedor");
                registros[1] = rs.getString("rut_vendedor");
                registros[2] = rs.getString("rut_veri");
                registros[3] = rs.getString("nombre_vendedor");
                registros[4] = rs.getString("apellido_paterno_vendedor");
                registros[5] = rs.getString("apellido_materno_vendedor");
                registros[6] = rs.getString("id_suc");
                registros[7] = rs.getString("correo_vendedor");
                registros[8] = rs.getString("telefono_vendedor");

                ModeloTabla.addRow(registros);
            }

            tabla.setModel(ModeloTabla);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para modificar un registro ya existente en la tabla "Vendedor",
     * usando el id al momento de elegir el registro a modificar
     *
     * @param rut
     * @param rutVer
     * @param nombre
     * @param apellidoPat
     * @param apellidoMat
     * @param suc
     * @param correo
     * @param telefono
     * @param id
     */
    public void modificar(String rut, String rutVer, String nombre, String apellidoPat, String apellidoMat, int suc, String correo, String telefono, String id) {

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

        if (confirmar == JOptionPane.YES_OPTION) {

            Connection con = null;

            try {

                con = Conexion.getConexion();

                String sql = "UPDATE vendedor SET rut_vendedor = ?, rut_veri = ?, nombre_vendedor = ?, apellido_paterno_vendedor = ?, apellido_materno_vendedor = ?, "
                        + "id_suc = ?, correo_vendedor = ?, telefono_vendedor = ?"
                        + "WHERE  id_vendedor = ?";

                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, rut);
                pst.setString(2, rutVer);
                pst.setString(3, nombre);
                pst.setString(4, apellidoPat);
                pst.setString(5, apellidoMat);
                pst.setInt(6, suc);
                pst.setString(7, correo);
                pst.setString(8, telefono);
                pst.setString(9, id);

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
     * Metodo para eliminar un registro ya existente en la tabla "Vendedor",
     * usando el id al momento de elegir el registro a eliminar
     *
     * @param id
     */
    public void eliminar(String id) {

        Connection con = null;

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");

        if (confirmar == JOptionPane.OK_OPTION) {

            try {

                String sql = "DELETE FROM vendedor "
                        + "WHERE id_vendedor = ? ";

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
     * Metodo para obtener los registros dentro de la tabla "Vendedor", para
     * luego usarlos y llenar un combobox
     *
     * @param cb
     */
    public static void obtenerListaVendedores(JComboBox cb) {
        cbm = new DefaultComboBoxModel();

        String sql = "SELECT * FROM vendedor";

        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione un Vendedor");
            while (rs.next()) {
                cbm.addElement(new Vendedor(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
