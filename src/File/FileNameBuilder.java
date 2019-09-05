
package File;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileNameBuilder {
    
    private String fileName;
    
    public FileNameBuilder(String fileName){
        
        this.fileName=fileName;
        
        
    }
    
    
    
    public File build(String extension){
        
        Pattern p=Pattern.compile(extension+"$");
        Matcher m=p.matcher(fileName);
        
        if(m.find()){
            return new File(fileName);
        }
        
        return new File(fileName+extension);
        
        
    }
    
}
