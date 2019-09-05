
package Utils.Filter.Megrendeles;

import Egyedek.Megrendeles;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Predicate;

public class RogzitDatumBefore implements Predicate<Megrendeles>{
    
    private LocalDate rogzitDatumTo;
 
    
    public RogzitDatumBefore(LocalDate rogzitDatumTo){
        if(rogzitDatumTo!=null){
        this.rogzitDatumTo=rogzitDatumTo.plusDays(1);
        }
        
    }

    @Override
    public boolean test(Megrendeles m) {
    
        return rogzitDatumTo==null ? true : m.getRogzitDatum().isBefore(LocalDateTime.of(rogzitDatumTo, LocalTime.of(0, 0)));
    }

}
