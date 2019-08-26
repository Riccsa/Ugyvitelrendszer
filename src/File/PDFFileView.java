/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import javax.swing.filechooser.FileView;

/**
 *
 * @author Bagi Richard
 */
public class PDFFileView extends FileView{
    
    private String extension="PDF";

    @Override
    public String getTypeDescription(File f) {
        return extension;
    }

    
    
    
    
    
}
