
package Check;

import javax.swing.JTextField;

public class NumberFormatCheck extends Check {

    @Override
    public boolean check(JTextField tf) {

        if (!tf.getText().equals("")) {

            try {
                Integer.parseInt(tf.getText());
            } catch (NumberFormatException ex) {
                return false;
            }

        }
        return true;
    }

}
