
package Utils.Filter.Aru;

import Egyedek.Aru;
import java.util.function.Predicate;


public class FilterGyarto implements Predicate<Aru>{
    
    String Pattern;
    
    public FilterGyarto(String Pattern){
        this.Pattern=Pattern;
    }

    @Override
    public boolean test(Aru a) {
        return Pattern.equals("") | Pattern==null ? true : a.getGyarto().equals(Pattern);
    }    
    
    
}
