
package Utils.Pattern;

import Egyedek.Partner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PartnerPattern implements Utils.Pattern.Pattern<Partner> {

    private Pattern pattern;

    public PartnerPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public List<Partner> findByPattern(List<Partner> list) {

        List<Partner> newList = new ArrayList<>();

        for (Partner partner : list) {    
            Matcher m = pattern.matcher(partner.toString());
            if (m.find()) {
                newList.add(partner);
            }
        }

        return newList;
    } 

}
