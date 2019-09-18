
package Egyedek;


public abstract class User {
    
    private static Dolgozo ACTIVE_USER=null;
    
   
   public static void setActiveUser(Dolgozo dolgozo){
       if(User.ACTIVE_USER==null && dolgozo!=null){
           User.ACTIVE_USER=dolgozo;
       }
   }
   
   public static Dolgozo geActiveUser(){
       return User.ACTIVE_USER;
   }
    
}
