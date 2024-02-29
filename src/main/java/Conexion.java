import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
	private static String connectionURL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    
    public static Connection getMySQLConnection()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
          
            Connection conn = DriverManager.getConnection(connectionURL, USER, PASSWORD);
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
}
