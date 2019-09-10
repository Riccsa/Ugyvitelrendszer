
package Utils.Pattern;

import Egyedek.Dolgozo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DolgozoPattern implements Utils.Pattern.Pattern<Dolgozo> {

    private Pattern pattern;

    public DolgozoPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public List<Dolgozo> findByPattern(List<Dolgozo> list) {

        List<Dolgozo> newList = new ArrayList<>();

        for (Dolgozo dolgozo : list) {    
            Matcher m = pattern.matcher(dolgozo.toString());
            if (m.find()) {
                newList.add(dolgozo);
            }
        }

        return newList;
    } 

}
