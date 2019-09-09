
package File;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class MyFileChooser extends JFileChooser{    
    

    @Override
    public void approveSelection() {

        this.setSelectedFile(build());

        if (!exists()) {

            super.approveSelection();

        } else {
            int retValue = JOptionPane.showConfirmDialog(this, "A fájl már létezik! Biztos felülírja?", "", JOptionPane.YES_NO_OPTION);

            if (retValue == JOptionPane.YES_OPTION) {
                super.approveSelection();

            }

        }
    }
    
    private boolean exists(){

        return  Files.exists(this.getSelectedFile().toPath()); 
        
    }
    
    private File build(){
        
        Pattern p=Pattern.compile(this.getFileFilter().getDescription()+"$");
        Matcher m=p.matcher(this.getSelectedFile().getName());
        
        if(m.find()){
            return this.getSelectedFile();
        }
        
        return new File(this.getSelectedFile()+this.getFileFilter().getDescription());

    } 
    
}
