
package Utils.Filter.Megrendeles;

import Egyedek.Megrendeles;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Predicate;

public class RogzitDatumAfter implements Predicate<Megrendeles>{
    
    private LocalDate rogzitDatumFrom;
 
    
    public RogzitDatumAfter(LocalDate rogzitDatumFrom){
        if(rogzitDatumFrom!=null){
        this.rogzitDatumFrom=rogzitDatumFrom;
        }
    }

    @Override
    public boolean test(Megrendeles m) {
         
        return rogzitDatumFrom==null ? true : m.getRogzitDatum().isAfter(LocalDateTime.of(rogzitDatumFrom, LocalTime.of(0, 0)));
    }

}
