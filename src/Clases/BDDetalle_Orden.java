package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Clase encargada de realizar las modificaciones a la tabla "Detalle_Orden"
 *
 * @author Kendall
 */
public class BDDetalle_Orden {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;

    /**
     * Metodo para guardar un registro en la tabla "Detalle_Orden", con sus
     * respectivos datos
     *
     * @param idOrden
     * @param tipoPrenda
     * @param estadoDetalle
     * @param observacion
     * @return
     */
    public int insertar(int idOrden, int tipoPrenda, int estadoDetalle, String observacion) {
        int resultado = 0;

        Connection con = null;

        String SQL = ("INSERT INTO detalle_orden (id_orden, id_tipo_prenda, id_estado_detalle, observacion)"
                + "VALUES (?, ?, ?, ?)");

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrden);
            ps.setInt(2, tipoPrenda);
            ps.setInt(3, estadoDetalle);
            ps.setString(4, observacion);
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la informacion" + e, "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    /**
     * Metodo para buscar un registro ya existente en la tabla basandose en un
     * filtro
     *
     * @param valor
     * @param filtro
     * @param tabla
     */
    public void buscar(String valor, String filtro, JTable tabla) {

        DefaultTableModel ModeloTabla;

        String[] columnas = {"Id", "Orden", "Prenda", "Detalle", "Observacion"};
        String[] registros = new String[5];
        ModeloTabla = new DefaultTableModel(null, columnas);

        String SQL;
        Connection conn = null;

        if (filtro.equals("Orden")) {

            SQL = "SELECT * FROM detalle_orden WHERE id_orden LIKE '%" + valor + "%'";

        } else if (filtro.equals("Prenda")) {

            SQL = "SELECT * FROM detalle_orden WHERE id_tipo_prenda LIKE '%" + valor + "%'";

        } else {

            SQL = "SELECT * FROM detalle_orden WHERE id_estado_detalle LIKE '%" + valor + "%'";

        }

        try {

            conn = Conexion.getConexion();
            PreparedStatement st = conn.prepareStatement(SQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("id_detalle");
                registros[1] = rs.getString("id_orden");
                registros[2] = rs.getString("id_tipo_prenda");
                registros[3] = rs.getString("id_estado_detalle");
                registros[4] = rs.getString("observacion");

                ModeloTabla.addRow(registros);
            }

            tabla.setModel(ModeloTabla);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para modificar un registro ya existente en la tabla
     *
     * @param idOrden
     * @param tipoPrenda
     * @param estadoDetalle
     * @param observacion
     * @param id
     */
    public void modificar(int idOrden, int tipoPrenda, int estadoDetalle, String observacion, String id) {

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

        if (confirmar == JOptionPane.YES_OPTION) {

            Connection con = null;

            try {

                con = Conexion.getConexion();

                String sql = "UPDATE detalle_orden SET id_orden = ?, id_tipo_prenda = ?, id_estado_detalle = ?, observacion = ?"
                        + "WHERE  id_detalle = ?";

                PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1, idOrden);
                pst.setInt(2, tipoPrenda);
                pst.setInt(3, estadoDetalle);
                pst.setString(4, observacion);
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
     * Metodo para eliminar un registro de la tabla usando el id de este
     *
     * @param id
     */
    public void eliminar(String id) {

        Connection con = null;

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");

        if (confirmar == JOptionPane.OK_OPTION) {

            try {

                String sql = "DELETE FROM detalle_orden "
                        + "WHERE id_detalle = ? ";

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
