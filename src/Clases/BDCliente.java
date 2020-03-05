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
 * Clase encargada de realizar las modificaciones a nuestra tabla "Cliente"
 *
 * @author Kendall
 */
public class BDCliente {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;

    /**
     * Metodo para insertar un registro en la tabla "Cliente" con sus
     * respectivos datos
     *
     * @param rut
     * @param rutVeri
     * @param nombre
     * @param apePat
     * @param apeMat
     * @param idSuc
     * @param telefono
     * @param correo
     * @return
     */
    public int insertar(int rut, int rutVeri, String nombre, String apePat, String apeMat, int idSuc, int telefono, String correo) {
        int resultado = 0;

        Connection con = null;
        String SQL = "INSERT INTO cliente (rut_cliente, rut_veri, nombre_cliente, apellido_paterno_cliente, apellido_materno_cliente, "
                + "id_suc, telefono_cliente, correo_cliente)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, rut);
            ps.setInt(2, rutVeri);
            ps.setString(3, nombre);
            ps.setString(4, apePat);
            ps.setString(5, apeMat);
            ps.setInt(6, idSuc);
            ps.setInt(7, telefono);
            ps.setString(8, correo);

            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la informacion" + e, "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    /**
     * Metodo para buscar un registro en la tabla "Clientes" basandose en un
     * filtro al momento de buscar
     *
     * @param valor
     * @param filtro
     * @param tabla
     */
    public void buscar(String valor, String filtro, JTable tabla) {

        DefaultTableModel ModeloTabla;

        String[] columnas = {"Id", "Rut", "Verificador", "Nombre", "Apellido Paterno", "Apellido Materno", "Sucursal", "Telefono", "Correo"};
        String[] registros = new String[9];
        ModeloTabla = new DefaultTableModel(null, columnas);

        String SQL;
        Connection conn = null;

        if (filtro.equals("Nombres")) {

            SQL = "SELECT * FROM cliente WHERE nombre_cliente LIKE '%" + valor + "%'";
        } else {

            SQL = "SELECT * FROM cliente WHERE id_suc LIKE '%" + valor + "%'";

        }

        try {

            conn = Conexion.getConexion();
            PreparedStatement st = conn.prepareStatement(SQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("id_cliente");
                registros[1] = rs.getString("rut_cliente");
                registros[2] = rs.getString("rut_veri");
                registros[3] = rs.getString("nombre_cliente");
                registros[4] = rs.getString("apellido_paterno_cliente");
                registros[5] = rs.getString("apellido_materno_cliente");
                registros[6] = rs.getString("id_suc");
                registros[7] = rs.getString("telefono_cliente");
                registros[8] = rs.getString("correo_cliente");

                ModeloTabla.addRow(registros);
            }

            tabla.setModel(ModeloTabla);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para modificar un registro ya existente en la tabla "Cliente"
     *
     * @param rut
     * @param rutVer
     * @param nombre
     * @param apellidoPat
     * @param apellidoMat
     * @param suc
     * @param telefono
     * @param correo
     * @param id
     */
    public void modificar(String rut, String rutVer, String nombre, String apellidoPat, String apellidoMat, int suc, String telefono, String correo, String id) {

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

        if (confirmar == JOptionPane.YES_OPTION) {

            Connection con = null;

            try {

                con = Conexion.getConexion();

                String sql = "UPDATE cliente SET rut_cliente = ?, rut_veri = ?, nombre_cliente = ?, apellido_paterno_cliente = ?, apellido_materno_cliente = ?, "
                        + "id_suc = ?, telefono_cliente = ?,correo_cliente = ?"
                        + "WHERE  id_cliente = ?";

                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, rut);
                pst.setString(2, rutVer);
                pst.setString(3, nombre);
                pst.setString(4, apellidoPat);
                pst.setString(5, apellidoMat);
                pst.setInt(6, suc);
                pst.setString(7, telefono);
                pst.setString(8, correo);
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
     * Metodo para eliminar un registro ya existente en la tabla, usando el id
     * al momento de seleccionar
     *
     * @param id
     */
    public void eliminar(String id) {

        Connection con = null;

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");

        if (confirmar == JOptionPane.OK_OPTION) {

            try {

                String sql = "DELETE FROM cliente "
                        + "WHERE id_cliente = ? ";

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
     * Metodo para llenar un combobox con los registros de la tabla "Clientes"
     *
     * @param cb
     */
    public static void obtenerListaClientes(JComboBox cb) {
        cbm = new DefaultComboBoxModel();

        String sql = "SELECT * FROM cliente";

        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione un Cliente");
            while (rs.next()) {
                cbm.addElement(new Cliente(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
