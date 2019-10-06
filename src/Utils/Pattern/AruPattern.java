
package Utils.Pattern;

import Egyedek.Aru;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AruPattern implements Utils.Pattern.Pattern<Aru> {

    private Pattern pattern;

    public AruPattern(Pattern pattern) {
        this.pattern = pattern;
         
    }

    @Override
    public List<Aru> findByPattern(List<Aru> list) {

        List<Aru> newList = new ArrayList<>();

        for (Aru aru : list) {
            Matcher m = pattern.matcher(aru.toString());
            
 
            if (m.find()) {
                newList.add(aru);
            }
        }

        return newList;
    }

}
