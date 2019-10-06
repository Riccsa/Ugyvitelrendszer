package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class SQL {

    private static Connection conn;
    
    public static Connection getConnection() throws SQLException{

        if (conn == null) {
            
            BufferedReader br;   
            Properties prop=new Properties();
            try {
                br = new BufferedReader(new FileReader(new File("src/Utils/SQLConfig.properties")));
                prop.load(br);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }
                       
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ugyvitel?useSSL=false&serverTimezone=CET", prop.getProperty("user"), prop.getProperty("password"));

        }
        
        return conn;
    }

}
