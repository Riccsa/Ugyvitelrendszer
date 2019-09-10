
package File;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;


public class FilePDF {
    
    protected PDDocument doc;
    protected File file;
    protected PDFont times;
    protected PDFont timesBold;
    protected PDPageContentStream cont;
    protected PDPage page;
    
    public FilePDF(File file) {
        doc = new PDDocument();
        page = new PDPage();
        
        this.file = file;
        try {
            times = PDType0Font.load(doc, new File("c:/windows/fonts/times.ttf"));
            timesBold = PDType0Font.load(doc, new File("c:/windows/fonts/timesbd.ttf"));
            cont = new PDPageContentStream(doc, page);
        } catch (IOException ex) {
            System.out.println("Hiba a font betöltése közben!");
            
        }
        
    }
    
    protected void beginText() throws IOException{
        cont.beginText();
    }
    
    protected void endText() throws IOException{
        cont.endText();
    }
    
    protected void close() throws IOException{
        cont.close();
    }
    protected void save() throws IOException{
        doc.save(file);
    }
    
    protected void addPage(){
        doc.addPage(page);
    }
     
    
    
}
