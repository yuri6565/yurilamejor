package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ediso
 */
public class Conexion {

    //conexion local

   public static Connection getConnection() {
      Connection con = null; 
        try {
        String myBD = "jdbc:mysql://localhost:3306/bd_sistema_ventas?serverTimezone=UTC";
         con = DriverManager.getConnection(myBD, "root", ""); 
         System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return con; 
        
    }

 
}

