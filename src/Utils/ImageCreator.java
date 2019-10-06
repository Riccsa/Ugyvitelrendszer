
package Utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JOptionPane;


public class ImageCreator {
    
    private JComponent component;
    
    public ImageCreator(JComponent component){
        this.component=component;
    }
    
    public BufferedImage getImage(){
        BufferedImage bf=new BufferedImage(component.getHeight(), component.getWidth(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g=(Graphics2D) bf.getGraphics();
        g.scale(0.75, 0.75);
       
        component.paint(g);
        try {
            ImageIO.write(bf, "jpg", new File("kep.jpg"));
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
        }
        
        return bf;
    }
    
}
