/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Bagi Richard
 */
public class CSVFilter  extends FileFilter{

    @Override
    public boolean accept(File f) {
        
        return true;
        
    }

    @Override
    public String getDescription() {
        return ".csv";
    }
    
    
}
