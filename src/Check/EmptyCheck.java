
package Check;

import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JTextField;


public class EmptyCheck extends Check{

    @Override
    public boolean check(JTextField tf) {
        return !tf.getText().equals("");
    }
    
    public boolean check(List<JTextField> list) {

        for (JTextField tf : list) {
            if(!check(tf)){
                return false;
            }
        }

        return true;

    }
    
    public boolean checkNotNull(Object o){
        
        return o!=null;
    }
    
    public boolean isCheckBoxSelected(List<JCheckBox> list){
        
        for(JCheckBox checkBox : list){
            if(!checkBox.isSelected()){
                return false;
            }
        }
        
        return true;
            
    }
   
  
    
    
}
