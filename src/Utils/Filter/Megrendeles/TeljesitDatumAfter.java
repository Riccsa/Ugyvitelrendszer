
package Utils.Filter.Megrendeles;

import Egyedek.Megrendeles;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Predicate;

public class TeljesitDatumAfter implements Predicate<Megrendeles> {

    private LocalDate teljesitDatumFrom;

    public TeljesitDatumAfter(LocalDate teljesitDatumFrom) {
        if (teljesitDatumFrom != null) {
            this.teljesitDatumFrom = teljesitDatumFrom;
        }
    }

    @Override
    public boolean test(Megrendeles m) {
        
        return m.getTeljesitDatum()==null || teljesitDatumFrom==null ? true : m.getTeljesitDatum().isAfter(LocalDateTime.of(teljesitDatumFrom, LocalTime.of(0, 0)));
    }

}
