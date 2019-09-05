
package Check;

import java.time.LocalDate;
import java.util.regex.Pattern;
import javax.swing.JTextField;


public class DateCheck extends Check{

    @Override
    public boolean check(JTextField tf) {
        return Pattern.matches("\\b\\d{4}-\\d{2}-\\d{2}$", tf.getText());
    }
    
    public boolean isDateFromEarlier(LocalDate dateFrom, LocalDate DateTo){
        
        
        return dateFrom.isBefore(DateTo);
        
    }
      
}
