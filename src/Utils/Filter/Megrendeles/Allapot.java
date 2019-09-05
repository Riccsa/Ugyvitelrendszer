
package Utils.Filter.Megrendeles;

import Egyedek.Megrendeles;
import Utils.Filter.Filters;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.JCheckBox;

public class Allapot implements Predicate<Megrendeles>{
    
    private String Pattern="";
    
    public Allapot(List<JCheckBox> lista){
          this.Pattern=Filters.getFilterValues(lista);
             
    }

    @Override
    public boolean test(Megrendeles m) {
        return m.getAllapot().matches(Pattern);
    }

}
