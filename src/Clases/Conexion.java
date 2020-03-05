package Clases;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * La clase Conexion es la que se encargara de realizar la conexion a la base de datos diseño app
 * Posteriormente se exportara a las clases que deban utilizarla para realizar acciones en ella
 * @author Kendall
 */

public class Conexion {
   public static final String URL = "jdbc:mysql://localhost:3306/diseñoapp";
    public static final String USERNAME = "root";
    public static final String PASS = "1234";

    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConexion() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASS);
            

        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }
}
    

