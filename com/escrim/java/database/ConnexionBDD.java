
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris_000
 */
public class ConnexionBDD {

    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    private static String DB_URL = "jdbc:mysql://localhost/escrim";

    private static String USER = "username";
    private static String PASS = "password";

    private static Connection connect;

    /**
     * Méthode qui va nous retourner notre instance
     * et la créer si elle n'existe pas...
     * @return
     */
    public static Connection getInstance(){
        if(connect == null){
            try {
                connect = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }		
        return connect;	
   }
}
