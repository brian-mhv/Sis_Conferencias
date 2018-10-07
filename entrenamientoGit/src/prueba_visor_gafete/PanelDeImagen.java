
package prueba_visor_gafete;


import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PanelDeImagen extends JComponent
{

    private int width, height;

    
    BufferedImage img=null;

    
    public PanelDeImagen()
    {
        width = 860;    // arbitrary size for empty panel
        height = 460;
        
     }
    public void setImage()
    {
        try {
            img = ImageIO.read(new File("pruebaf.jpg"));
        } catch (IOException e) {
            System.out.println("No existe la imagen");
        }
        
        
        if(img != null) {
            repaint();
        }
    }
    
    
    public void clearImage()
    {
        if(img != null) {
            Graphics imageGraphics = img.getGraphics();
            imageGraphics.setColor(Color.LIGHT_GRAY);
            imageGraphics.fillRect(0, 0, width, height);
            repaint();
        }
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(width, height);
    }
    
    public void paintComponent(Graphics g)
    {
        Font fuente=new Font("Arial", Font.PLAIN, 35);
        
        Dimension size = getSize();
        g.clearRect(0, 0, size.width, size.height);
        if(img != null) {
            g.drawImage(img, 0, 0, null);
            g.setFont(fuente);
            g.drawString("Scrum", 50,100 );
        }
    }
}

