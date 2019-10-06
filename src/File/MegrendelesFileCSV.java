
package File;

import Egyedek.Megrendeles;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;


public class MegrendelesFileCSV implements FileCSV<Megrendeles> {

    private File file;

    public MegrendelesFileCSV(File file) {
        this.file = file;
    }

    @Override
    public void export(List<Megrendeles> lista) {

        try {

            PrintWriter pw = new PrintWriter(new FileWriter(file));

            for (Megrendeles m : lista) {

                pw.println(m.toCSV());

            }
            pw.close();

        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);

        }

    }

}
