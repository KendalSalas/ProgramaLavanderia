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
 * Clase encargada de realizar las acciones a nuestra tabla "Boleta"
 *
 * @author Kendall
 */
public class BDBoleta {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;

    /**
     * Metodo para guardar una Boleta en la BD correspondiente, recibiendo los
     * parametros correspondientes para su llenado
     *
     * @param idMetPago
     * @param neto
     * @param iva
     * @param idOrden
     * @return
     */
    public int insertar(int idMetPago, int neto, double iva, int idOrden) {
        int resultado = 0;

        Connection con = null;

        String SQL = ("INSERT INTO boleta (id_metodo_pago, neto, iva, id_orden)"
                + "VALUES (?, ?, ?, ?)");

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idMetPago);
            ps.setInt(2, neto);
            ps.setDouble(3, iva);
            ps.setInt(4, idOrden);
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la informacion" + e, "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    /**
     * Metodo para buscar los datos en la BD, en este caso se realizara una
     * busqueda general para llenar la tabla
     *
     * @param tabla
     */
    public void buscar(JTable tabla) {

        DefaultTableModel ModeloTabla;

        String[] columnas = {"Id", "Medio Pago", "Neto", "Iva", "Orden"};
        String[] registros = new String[5];
        ModeloTabla = new DefaultTableModel(null, columnas);

        String SQL;
        Connection conn = null;

        SQL = "SELECT * FROM boleta";

        try {

            conn = Conexion.getConexion();
            PreparedStatement st = conn.prepareStatement(SQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("id_boleta");
                registros[1] = rs.getString("id_metodo_pago");
                registros[2] = rs.getString("neto");
                registros[3] = rs.getString("iva");
                registros[4] = rs.getString("id_orden");

                ModeloTabla.addRow(registros);
            }

            tabla.setModel(ModeloTabla);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para modificar una Boleta ya existente en la base de datos, usando
     * el id de esta como referencia
     *
     * @param idOrden
     * @param neto
     * @param iva
     * @param idMetPago
     * @param id
     */
    public void modificar(int idOrden, int neto, double iva, int idMetPago, String id) {

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

        if (confirmar == JOptionPane.YES_OPTION) {

            Connection con = null;

            try {

                con = Conexion.getConexion();

                String sql = "UPDATE boleta SET id_orden = ?, neto = ?, iva = ?, id_metodo_pago = ?"
                        + "WHERE  id_boleta = ?";

                PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1, idOrden);
                pst.setInt(2, neto);
                pst.setDouble(3, iva);
                pst.setInt(4, idMetPago);
                pst.setString(5, id);

                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido modificados exitosamente", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido realizar la operacion", "Operacion Fallida", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualizacion de los datos " + "Error: " + e, "Error en la operacion ", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    /**
     * Metodo para eliminar un registro de la base de datos segun el id que
     * corresponda
     *
     * @param id
     */
    public void eliminar(String id) {

        Connection con = null;

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");

        if (confirmar == JOptionPane.OK_OPTION) {

            try {

                String sql = "DELETE FROM boleta "
                        + "WHERE id_boleta = ? ";

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

}
