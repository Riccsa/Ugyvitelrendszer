
package Utils.Comparator;

import Egyedek.Aru;
import java.util.Comparator;


public class AruNettoComparator implements Comparator<Aru>{

    @Override
    public int compare(Aru a1, Aru a2) {
        return new Integer(a1.getNetto()).compareTo(a2.getNetto());
    }
    
    
}
