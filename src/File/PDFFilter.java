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
public class PDFFilter  extends FileFilter{

    @Override
    public boolean accept(File f) {
        
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');
 
        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return "pdf".equals(ext);
    }

    @Override
    public String getDescription() {
        return "PDF Document";
    }
    
}
