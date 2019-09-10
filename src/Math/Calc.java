
package Math;


public class Calc {
    
   private int sum=0;
   
   public Calc(){
       
   }
   
   public Calc(int num){
       this.sum=num;
   }   
   
    public static String getBrutto(Integer afa, Integer netto){
        
        int afaNum=afa;
        int nettoNum=netto;
        double osszeg=Math.round(((100+afaNum)/100.0)*nettoNum);       
        return Integer.toString((int) osszeg);    
        
    }
    
    public String add(int num){
        
        sum=sum+num;
        
        return Integer.toString(sum);
  
    }
    
    public String subtract(int num){
        
        sum=sum-num;
        return Integer.toString(sum);
        
    }
    

    public int getSum() {
        return sum;
    }

    
}
