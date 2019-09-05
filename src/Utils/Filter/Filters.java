
package Utils.Filter;

import java.util.List;
import javax.swing.JCheckBox;


public abstract class Filters{
    
    
    public static String getFilterValues(List<JCheckBox> lista) {
        
        String Pattern="";
        
        for (JCheckBox checkBox : lista) {
            if (checkBox.isSelected()) {
                if (!Pattern.equals("")) {
                    Pattern = Pattern.concat("|");

                }
                Pattern = Pattern.concat(checkBox.getName());

            }
        }

        if (Pattern.equals("")) {
            for (JCheckBox checkBox : lista) {
                if (!Pattern.equals("")) {
                   Pattern = Pattern.concat("|");

                }
                Pattern = Pattern.concat(checkBox.getName());

            }

        }
        
        return Pattern;

    }
    
    
}
