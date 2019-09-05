
package Utils.Comparator;

import Egyedek.Partner;
import java.util.Comparator;

public class PartnerNevComparator implements Comparator<Partner>{

    @Override
    public int compare(Partner p1, Partner p2) {
        
        return p1.getNev().compareTo(p2.getNev());
        
    }
 
}
