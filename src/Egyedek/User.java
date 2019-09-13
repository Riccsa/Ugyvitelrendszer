/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egyedek;

/**
 *
 * @author richard.bagi
 */
public abstract class User {
    
    private static String nev=null;
    
   
   public static void setActiveUser(Dolgozo dolgozo){
       if(User.nev!=null && dolgozo!=null){
           User.nev=dolgozo.getNev();
       }
   }
   
   public String getUser(){
       return User.nev;
   }
    
}
