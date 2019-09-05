
package Utils.Comparator;

import Egyedek.Aru;
import java.util.Comparator;


public class AruDbComparator implements Comparator<Aru>{

    @Override
    public int compare(Aru a1, Aru a2) {
        
      return new Integer(a1.getKeszlet()).compareTo(a2.getKeszlet());
      
    }

}
