
package Utils.Filter.Megrendeles;

import Egyedek.Megrendeles;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Predicate;

public class TeljesitDatumBefore implements Predicate<Megrendeles>{
    
    private LocalDate teljesitDatumTo;
 
    
    public TeljesitDatumBefore(LocalDate teljesitDatumTo){
        if(teljesitDatumTo!=null){
        this.teljesitDatumTo=teljesitDatumTo.plusDays(1);    
        }
    }

    @Override
    public boolean test(Megrendeles m) {
        return m.getTeljesitDatum()==null || teljesitDatumTo==null ? true : m.getRogzitDatum().isBefore(LocalDateTime.of(teljesitDatumTo, LocalTime.of(0, 0)));
    }

}
