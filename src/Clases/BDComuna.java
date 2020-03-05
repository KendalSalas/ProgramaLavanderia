package Clases;

import static Clases.BDCiudad.cbm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Esta será la clase encargada de conectarse a la base de datos para obtener
 * las comunas existentes en ella y luego agregarlas a un combo box
 *
 * @author Kendall
 */
public class BDComuna {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;
    public static DefaultComboBoxModel cbm;

    /**
     * Metodo para llenar un combobox con las comunas existentes en la base de
     * datos
     *
     * @param cb
     */
    public static void obtenerListaComunas(JComboBox cb) {

        cbm = new DefaultComboBoxModel();

        String sql = "SELECT * FROM comuna";

        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione una Comuna");
            while (rs.next()) {
                cbm.addElement(new Comuna(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }

}
