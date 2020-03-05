package Clases;

import static Clases.BDRegiones.cbm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Clase encargada de llenar un combobox con los datos de la tabla "Metodo_Pago"
 *
 * @author Kendall
 */
public class BDMetodoPago {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;
    public static DefaultComboBoxModel cbm;

    /**
     * Metodo para llenar un combobox con los datos de la tabla "Metodo_Pago"
     *
     * @param cb
     */
    public static void obtenerListaMetodos(JComboBox cb) {

        cbm = new DefaultComboBoxModel();
        String sql = "SELECT * FROM metodo_pago";
        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione un Metodo de Pago");
            while (rs.next()) {
                cbm.addElement(new MetodoPago(rs.getInt(1), rs.getString(2)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }
}
