package Clases;

import static Clases.BDComuna.cbm;
import static Clases.Conexion.getConexion;
import Pantallas.RegistroSucursal;
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
 * Esta clase sera la encargada de realizar las modificaciones a nuestra tabla
 * Sucursal
 *
 * @author Kendall
 */
public class BDSucursal {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;
    DefaultTableModel ModeloTabla;

    /**
     * Metodo encargado de INSERTAR valores a la tabla "Sucursal"
     *
     * @param id
     * @param id_cm
     * @param direccion
     * @param correo
     * @param tel
     *
     *
     */
    public static void insertar(int id_cm, String direccion, String correo, int tel) {
        String sql = "INSERT INTO sucursal (id_com, direccion_suc, correo_suc, telefono)"
                + "VALUES (?,?,?,?)";

        try {
            conn = Conexion.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id_cm);
            pst.setString(2, direccion);
            pst.setString(3, correo);
            pst.setInt(4, tel);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sucursal almacenada correctamente", "INGRESO", 1);
        } catch (Exception e) {
            System.err.println("Excepción al agregar: " + e);
        }
    }

    /**
     * Metodo Para BUSCAR un registro en la base de datos, utilizando el ID de
     * sucursal para filtrar y luego agregarlo a la tabla
     *
     * @param id
     * @param tabla
     *
     *
     */
    public void buscar(int id, JTable tabla) {

        String[] columnas = {"Id Sucursal", "Comuna", "Direccion", "Correo", "Telefono"};
        String[] registros = new String[5];
        ModeloTabla = new DefaultTableModel(null, columnas);
        String ssql;

        //Se genera la consulta a la Base de Datos, utilizando id_suc para filtrar los datos 
        ssql = "SELECT * FROM sucursal WHERE id_suc LIKE '%" + id + "%'";

        try {
            conn = Conexion.getConexion();
            pst = conn.prepareStatement(ssql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                //Se obtienen los registros y se cargan a la tabla 
                registros[0] = rs.getString("id_suc");
                registros[1] = rs.getString("id_com");
                registros[2] = rs.getString("direccion_suc");
                registros[3] = rs.getString("correo_suc");
                registros[4] = rs.getString("telefono");

                ModeloTabla.addRow(registros);
            }

            //Se carga el modelo a la tabla
            tabla.setModel(ModeloTabla);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error Durante el Procedimiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para modificar un registro ya existente en la base de datos
     * utilizando el id_suc para modificar
     *
     * @param id
     * @param com
     * @param direccion
     * @param correo
     * @param tel
     *
     *
     */
    public void modificar(int com, String direccion, String correo, int tel, String id) {

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

        if (confirmar == JOptionPane.YES_OPTION) {

            try {
                //Se genera la consulta
                conn = Conexion.getConexion();
                String sql = "UPDATE sucursal SET id_com = ?, direccion_suc = ?, correo_suc = ?, telefono = ?"
                        + "WHERE id_suc = ?";
                pst = conn.prepareStatement(sql);
                pst.setInt(1, com);
                pst.setString(2, direccion);
                pst.setString(3, correo);
                pst.setInt(4, tel);
                pst.setString(5, id);

                if (pst.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "Los datos se han modificado correctamente", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar datos", "Operación Fallida", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e, "Error Durante el Procedimiento", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    /**
     * Metodo para eliminar un registro de nuestra base de datos utilizando el
     * id_suc al momento de borrar el registro
     *
     * @param id
     *
     *
     */
    public void eliminar(String id) {

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el registro?");

        if (confirmar == JOptionPane.OK_OPTION) {

            try {
                //Se genera la consulta, validando el id_suc
                String sql = "DELETE FROM sucursal WHERE id_suc = ?";

                conn = Conexion.getConexion();
                pst = conn.prepareStatement(sql);
                pst.setString(1, id);

                if (pst.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "El registro se ha eliminado correctamente");

                } else {

                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");

                }
            } catch (SQLException e) {
                System.err.println(e);
            }

        }

    }

    /**
     * Metodo para obtener las sucursales guardadas en la tabla y usarlos para
     * llenar un combobox
     *
     * @param cb
     */
    public static void obtenerListaSucursales(JComboBox cb) {
        cbm = new DefaultComboBoxModel();

        String sql = "SELECT * FROM sucursal";

        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione una Sucursal");
            while (rs.next()) {
                cbm.addElement(new Sucursal(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
