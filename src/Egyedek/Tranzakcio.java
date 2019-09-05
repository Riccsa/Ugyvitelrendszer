
package Egyedek;

import java.time.LocalDate;


public abstract class Tranzakcio {
    
    protected Integer id;
    protected Integer dolgozoId;
    protected LocalDate datum;
    protected boolean teljesitve;

    public Tranzakcio(Integer dolgozoId, LocalDate datum, boolean teljesitve) {
        this.dolgozoId = dolgozoId;
        this.datum = datum;
        this.teljesitve = teljesitve;
    }
    
    

    
}
