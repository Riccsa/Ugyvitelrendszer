
package Utils.Comparator;

import Egyedek.Aru;
import java.util.Comparator;


public class AruNevComparator implements Comparator<Aru>{

    @Override
    public int compare(Aru a1, Aru a2) {
       return a1.getNev().compareTo(a2.getNev());
    }
    
    
    
}
