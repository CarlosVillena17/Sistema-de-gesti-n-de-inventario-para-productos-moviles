
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    public static final String URL="jdbc:mysql://localhost:3306/tiendacelularesED?useTimezone=true&serverTimezone=UTC";
    public static final String usuario="root";
    public static final String contraseña="933323597";
    public Connection getConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Carga los drivers de la base de datos 
            conexion=(Connection) DriverManager.getConnection(URL, usuario, contraseña); //establece la conexion
        }catch(Exception ex){
            System.out.println("Error"+ ex);
        }
        return conexion;
    }
}
