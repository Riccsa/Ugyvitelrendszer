
package Utils.Comparator;

import Egyedek.Aru;
import java.util.Comparator;


public class AruMinDbComparator implements Comparator<Aru>{

    @Override
    public int compare(Aru a1, Aru a2) {
        return new Integer(a1.getMinKeszlet()).compareTo(a2.getMinKeszlet());
        
    }     
    
}
