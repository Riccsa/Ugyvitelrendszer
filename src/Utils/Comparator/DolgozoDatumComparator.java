
package Utils.Comparator;

import Egyedek.Dolgozo;
import java.util.Comparator;

public class DolgozoDatumComparator implements Comparator<Dolgozo>{

    @Override
    public int compare(Dolgozo d1, Dolgozo d2) {
        
        return d1.getSzuletesiDatum().compareTo(d2.getSzuletesiDatum());
        
    }
 
}
