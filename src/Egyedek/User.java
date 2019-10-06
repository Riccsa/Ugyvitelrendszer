
package Egyedek;

import DAO.DolgozoRepositoryJDBC;
import java.sql.SQLException;


public abstract class User {
    
    public static  String jogosultsag;
    public static  String nev;
    public static  Integer id;

    
   public static void setActiveUser(Dolgozo dolgozo) throws SQLException{
       
       DolgozoRepositoryJDBC jdbc=new DolgozoRepositoryJDBC();
       if(jogosultsag==null && nev==null && id==null){
       User.nev=dolgozo.getNev();
       User.id=dolgozo.getId();
       User.jogosultsag=jdbc.findAccesLevelById(dolgozo.getId());
       }
     
   }
   

   
   
   
   
   

    
}
