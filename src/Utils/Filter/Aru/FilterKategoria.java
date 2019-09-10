
package Utils.Filter.Aru;

import Egyedek.Aru;
import java.util.function.Predicate;


public class FilterKategoria implements Predicate<Aru>{
    
    String Pattern;
    
    public FilterKategoria(String Pattern){
        this.Pattern=Pattern;
   
    }

    @Override
    public boolean test(Aru a) {
        return Pattern.equals("") | Pattern==null ? true : a.getKategoriaNev().equals(Pattern);
    }
    
}
