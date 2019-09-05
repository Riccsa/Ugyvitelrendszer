
package Utils.Filter.Megrendeles;

import Egyedek.Egyed;
import Egyedek.Megrendeles;
import Utils.Filter.Filters;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.JCheckBox;

public class Tipus implements Predicate<Megrendeles>{
    
    private String Pattern="";
    
    public Tipus(List<JCheckBox> lista){
          this.Pattern=Filters.getFilterValues(lista);       
    }

    @Override
    public boolean test(Megrendeles m) {
        return m.getTipus().matches(Pattern);
    }

}
