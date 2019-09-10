
package Utils.Comparator;

import Egyedek.Dolgozo;
import java.util.Comparator;

public class DolgozoNevComparator implements Comparator<Dolgozo>{

    @Override
    public int compare(Dolgozo d1, Dolgozo d2) {
        
        return d1.getNev().compareTo(d2.getNev());
        
    }
 
}
