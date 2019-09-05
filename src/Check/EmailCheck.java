
package Check;

import java.util.regex.Pattern;
import javax.swing.JTextField;


public class EmailCheck extends Check{

    @Override
    public boolean check(JTextField tf) {
        return Pattern.matches("^([\\w]+)\\.?[\\w]+\\@[\\w]+\\.[\\w]{2,3}$", tf.getText());
    }
    
    
}
