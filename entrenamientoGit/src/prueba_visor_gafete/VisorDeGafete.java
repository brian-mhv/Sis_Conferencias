package prueba_visor_gafete;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

public class VisorDeGafete
{
    private JFrame frame;
    private PanelDeImagen pi;
    private JButton imprimir;
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
        ImageIcon icono=new ImageIcon("p1print.png");
        imprimir=new JButton(icono);
        pi = new PanelDeImagen();
        pi.setImage();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(imprimir, BorderLayout.NORTH);
        contentPane.add(pi, BorderLayout.CENTER);
        
        //contentPane.add(nombre_asistente,BorderLayout.NORTH);

        // building is done - arrange the components and show        
        frame.pack();
        frame.setVisible(true);
    }
   
}