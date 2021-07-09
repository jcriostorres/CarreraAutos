
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author catalina
 */
public class ConexionBD {
    private final String URL = "jdbc:mysql://localhost:3306/carrera_autos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private final String USERNAME = "root";
    private final String PASSWORD = "41960845";
    private Connection conexionBD;
    
    public ConexionBD(){
        this.conexionBD = null;
    }
   
    
    public Connection conectarBD() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexionBD = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch ( ClassNotFoundException ex1) {
            ex1.printStackTrace(System.out);
        } catch (SQLException ex2) {
            ex2.printStackTrace(System.out);
        }
        return(conexionBD);
    }
    
    public void desconectarBD() {
        if (conexionBD != null) {
            try {
                conexionBD.close();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }


    
}
