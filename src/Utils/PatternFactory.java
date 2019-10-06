
package Utils;

import java.util.regex.Pattern;


public abstract class PatternFactory {

    public static Pattern create(String regex) {
        return Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
    }  

}
