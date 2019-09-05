
package Utils.Pattern;

import Egyedek.Megrendeles;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MegrendelesPattern implements Utils.Pattern.Pattern<Megrendeles> {

    private Pattern pattern;

    public MegrendelesPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public List<Megrendeles> findByPattern(List<Megrendeles> list) {

        List<Megrendeles> newList = new ArrayList<>();

        for (Megrendeles megrendeles : list) {    
            Matcher m = pattern.matcher(megrendeles.toString());
            if (m.find()) {
                newList.add(megrendeles);
            }
        }

        return newList;
    } 

}
