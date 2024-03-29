
package File;

import Egyedek.Aru;
import Egyedek.Megrendeles;
import Egyedek.Partner;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

public class SzamlaFilePDF extends FilePDF {

    private final String LABEL_DATUM = "Dátum: ";
    private final String LABEL_CIM = "Számla";
    private final String LABEL_CEG_NEV = "Cég neve: ";
    private final String LABEL_CIMZETT = "Címzett: ";
    private final String MINTA_CEG_NEV = "MintaCég Kft.";
    private final String MINTA_CEG_IRSZ = "1117";
    private final String MINTA_CEG_VAROS = "Budapest";
    private final String MINTA_CEG_UTCA = "Fő utca 2.";
    private final String VONAL = "____________________________________________________________________________________";
    private final String[] FEJLEC = {"Cikkszám", "Megnevezés", "Mennyiség", "ÁFA", "Bruttó egységár", "Nettó egységár"};
    private Megrendeles megrendeles;

    public SzamlaFilePDF(File file) {
        super(file);
    }

    public void export(Megrendeles megrendeles) {
        
        this.megrendeles=megrendeles;

        try {
            super.addPage();
            super.beginText();
            buildDefaultData(megrendeles.getPartner());
            cont.setFont(timesBold, 12);
            cont.newLineAtOffset(-400, -50);
            drawThread();
            cont.newLine();
            drawVonal();
            cont.setFont(times, 9);
            addAru(this.megrendeles.getLista());
            cont.newLineAtOffset(0, 0);
            cont.setFont(timesBold, 12);
            drawVonal();
            cont.newLineAtOffset(400, -30);
            cont.setFont(timesBold, 12);
            cont.showText(writeOsszeg(megrendeles.getOsszeg())+" Ft");
            super.endText();
            super.close();
            super.save();
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void addAru(List<Aru> lista) throws IOException {
        for (Aru aru : lista) {
            cont.newLineAtOffset(0, -20);
            cont.showText(Integer.toString(aru.getCikkszam()));
            cont.showText(offSetSpace(Integer.toString(aru.getCikkszam()).length(),30));
            cont.showText(aru.getNev());
            cont.newLineAtOffset(0, 0);
            cont.showText(offSetSpaceFromZeroToQuantity());
            cont.showText(Integer.toString(aru.getKeszlet()));
            cont.showText(offSetSpace(Integer.toString(aru.getKeszlet()).length(),30));
            cont.showText(Integer.toString(aru.getAfa()));
            cont.showText(offSetSpace(Integer.toString(aru.getAfa()).length(),32));
            cont.showText(Integer.toString(aru.getBrutto()));
            cont.newLineAtOffset(0, 0);
            cont.showText(offSetSpaceFromZeroToNetto());
            cont.showText(Integer.toString(aru.getNetto()));   
        }
    }

    private void buildDefaultData(Partner partner) throws IOException {
        cont.setFont(timesBold, 24);
        cont.newLineAtOffset(250, 700);
        cont.showText(LABEL_CIM);
        cont.setFont(timesBold, 14);
        cont.newLineAtOffset(200, -50);
        cont.showText(LABEL_DATUM);
        cont.setFont(times, 14);
        cont.showText(LocalDate.now().format((DateTimeFormatter.ofPattern("yyyy.MM.dd."))));
        cont.newLineAtOffset(-400, -50);
        cont.setFont(timesBold, 14);
        cont.showText(LABEL_CEG_NEV);
        cont.setFont(times, 14);
        cont.newLineAtOffset(0, -30);
        cont.showText(MINTA_CEG_NEV);
        cont.newLineAtOffset(0, -30);
        cont.showText(MINTA_CEG_IRSZ + ", " + MINTA_CEG_VAROS);
        cont.newLineAtOffset(0, -30);
        cont.showText(MINTA_CEG_UTCA);
        cont.newLineAtOffset(400, 90);
        cont.setFont(timesBold, 14);
        cont.showText(LABEL_CIMZETT);
        cont.newLineAtOffset(0, -30);
        cont.setFont(times, 14);
        cont.showText(partner.getNev());
        cont.newLineAtOffset(0, -30);
        cont.showText(Integer.toString(partner.getIranyitoszam()) + ", " + partner.getVaros());
        cont.newLineAtOffset(0, -30);
        cont.showText(partner.getCim());     
    }

    private void drawVonal() throws IOException {
        cont.showText(VONAL);

    }

    private void drawThread() throws IOException {
        for (String s : FEJLEC) {
            cont.showText(s + "          ");

        }
    }
    
    private String writeOsszeg(int osszeg){
        
        return Integer.toString(osszeg);
        
    }

    private String offSetSpace(int length, int maxSpace) {
        String space = "";
        for (int i = 0; i < maxSpace - length; i++) {
            space = space.concat(" ");

        }
        
       

        return space;

    }
    
    private String offSetSpaceFromZeroToQuantity( ) {
        return "                                                                                       ";

    }
    
     private String offSetSpaceFromZeroToNetto() {
         String space="";
         
          for (int i = 0; i <200; i++) {
            space = space.concat(" ");

        }
         
        return space;  
     

    }

}
