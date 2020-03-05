package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Este clase sera la encargada de llenar un combobox con los datos existentes
 * dentro de esta tabla
 *
 * @author Kendall
 */
public class BDCiudad {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;
    public static DefaultComboBoxModel cbm;

    /**
     * Metodo para llenar el combobox con las ciudades existentes en la base de
     * datos
     *
     * @param cb
     */
    public static void obtenerListaCiudades(JComboBox cb) {

        cbm = new DefaultComboBoxModel();
        String sql = "SELECT * FROM ciudad";

        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione una Ciudad");
            while (rs.next()) {
                cbm.addElement(new Ciudad(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
