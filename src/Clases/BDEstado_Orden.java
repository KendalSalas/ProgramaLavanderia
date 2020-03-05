package Clases;

import static Clases.BDComuna.cbm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Clase encargada de llenar un combobox con los datos de la tabla
 * "Estado_Orden"
 *
 * @author Kendall
 */
public class BDEstado_Orden {

    private static PreparedStatement pst;
    private static Statement st;
    private static Connection conn;
    private static ResultSet rs;
    public static DefaultComboBoxModel cbm;

    /**
     * Metodo para llenar el ComboBox con los datos de la tabla correspondiente
     *
     * @param cb
     */
    public static void obtenerListaEstado(JComboBox cb) {

        cbm = new DefaultComboBoxModel();

        String sql = "SELECT * FROM estado_orden";

        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            //Se obtiene cada registro y se agrega al listado
            cbm.addElement("Seleccione un Estado");
            while (rs.next()) {
                cbm.addElement(new Estado_Orden(rs.getInt(1), rs.getString(2)));
            }
            cb.setModel(cbm);

        } catch (Exception e) {
            System.err.println("Excepción al obtener lista: " + e);
        }
    }

}
