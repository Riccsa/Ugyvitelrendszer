
package File;

import Egyedek.Aru;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class AruFileCSV implements FileCSV<Aru>{
    
    private File file;
    
    public AruFileCSV(File file){
        this.file=file;
    }

    @Override
    public void export(List<Aru> lista) {
        
           try {

            PrintWriter pw = new PrintWriter(new FileWriter(file));

               for (Aru aru : lista) {

                       pw.println(aru.toCSV());
        
               }
               pw.close();

        } catch (IOException ex) {
                         
        }
           
        
    }
    
}
