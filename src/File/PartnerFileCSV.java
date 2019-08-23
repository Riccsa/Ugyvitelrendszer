
package File;

import Egyedek.Partner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class PartnerFileCSV implements FileCSV<Partner>{
    
    private File file;
    
    public PartnerFileCSV(File file){
        this.file=file;
    }

    @Override
    public void exportCSV(List<Partner> lista) {
        
           try {

            PrintWriter pw = new PrintWriter(new FileWriter(file));

               for (Partner partner : lista) {

                       pw.println(partner.toCSV());
        
               }
               pw.close();

        } catch (IOException ex) {
                         
        }
        
    }


    
}
