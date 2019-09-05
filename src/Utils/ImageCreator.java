
package Utils;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.swing.JComponent;


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
            System.out.println("hiba történt a kép exportálása közben");
        }
        
        return bf;
    }
    
}
