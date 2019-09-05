
package Utils.Comparator;

import Egyedek.Partner;
import java.util.Comparator;

public class PartnerKapcsNevComparator implements Comparator<Partner>{

    @Override
    public int compare(Partner p1, Partner p2) {
        
        return p1.getKapcsolattarto_nev().compareTo(p2.getKapcsolattarto_nev());
        
    }
 
}
