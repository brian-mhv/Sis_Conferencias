package prueba_visor_gafete;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VisorDeGafete
{
    private JFrame frame;
    private PanelDeImagen pi;
    private JLabel nombre_asistente=new JLabel("nombre");
    /**
     * Create an ImageViewer show it on screen.
     */
    public VisorDeGafete()
    {
        construirVentana();
    }


    private void salir()
    {
        System.exit(0);
    }
    
    private void construirVentana()
    {
        frame = new JFrame("gafete");
              
        Container contentPane = frame.getContentPane();
        
        pi = new PanelDeImagen();
        pi.setImage();
        //contentPane.setLayout(new BorderLayout());
        pi.add(nombre_asistente);
        contentPane.add(pi);
        
        //contentPane.add(nombre_asistente,BorderLayout.NORTH);

        // building is done - arrange the components and show        
        frame.pack();
        frame.setVisible(true);
    }
   
}