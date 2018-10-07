package prueba_visor_gafete;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

public class VisorDeGafete implements Printable
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
        imprimir.addActionListener(new ActionListener()
                {
                   public void actionPerformed(ActionEvent e)
                   {
                       try
                        {
                            PrinterJob imprticket = PrinterJob.getPrinterJob();
                            imprticket .setPrintable(new VisorDeGafete());
                            boolean impr = imprticket .printDialog();
            
                             if(impr)
                            {
                                imprticket.print();
                            }
                        }
                        catch(PrinterException pex)
                        {
                            System.out.println("Error\n" + pex);
                         }
                   }
                });
        contentPane.setLayout(new BorderLayout());
        contentPane.add(imprimir, BorderLayout.NORTH);
        contentPane.add(pi, BorderLayout.CENTER);        
        frame.pack();
        frame.setVisible(true);
    }
   public int print(Graphics graf, PageFormat pagfor, int page) throws PrinterException
    {
        if(page > 0)
        {
            return NO_SUCH_PAGE;
        }
        Graphics2D bot = (Graphics2D) graf;
        bot.translate(pagfor.getImageableX() + 30, pagfor.getImageableY()+ 30);
        bot.scale(1.0, 1.0);
        pi.printAll(graf);
        return PAGE_EXISTS;
    }
   
}