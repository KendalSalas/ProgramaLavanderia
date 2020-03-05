package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Esta sera la clase encargada de realizar una conexion a la base de datos para
 * obtener los registros existentes en la tabla REGIONES y luego agregarlos a un
 * combo box
 *
 * @author Kendall
 */
public class BDRegiones {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;
    public static DefaultComboBoxModel cbm;

    /**
     * Metodo encargado de obtener los registros existentes en la tabla
     * "Regiones" y usarlo para llenar un combobox
     *
     * @param cb
     */
    public static void obtenerListaRegiones(JComboBox cb) {
        /**
         * Este metodo es el encargado de traer los datos de nuestra base de
         * datos para luego agregarlos a un combo box
         */

        cbm = new DefaultComboBoxModel();
        String sql = "SELECT id_reg, nombre FROM regiones";
        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione una Region");
            while (rs.next()) {
                cbm.addElement(new Regiones(rs.getInt(1), rs.getString(2)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
