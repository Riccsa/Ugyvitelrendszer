package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SQL {

    private static Connection conn;
    
    public static Connection getConnection() throws SQLException {

        if (conn == null) {
            
           conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ugyvitel?useSSL=false&serverTimezone=CET", "root", "1234");

        }
        
        return conn;
    }

}
