package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Clase encargada de realizar metodos en la tabla "Prenda" de nuestra base de
 * datos
 *
 * @author Kendall
 */
public class BDPrenda {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;
    public static DefaultComboBoxModel cbm;

    /**
     * Metodo para llenar un combobox con los datos existentes en la tabla
     * "Prenda"
     *
     * @param cb
     */
    public static void obtenerListaPrendas(JComboBox cb) {

        cbm = new DefaultComboBoxModel();
        String sql = "SELECT * FROM tipo_prenda";
        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione una Prenda");
            while (rs.next()) {
                cbm.addElement(new Prenda(rs.getInt(1), rs.getString(2)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
