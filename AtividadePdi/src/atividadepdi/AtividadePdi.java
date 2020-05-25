/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepdi;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author fafic
 */
public class AtividadePdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedImage imagem = ImageIO.read( new File("testeHist2.jpg"));
        Metodos metodos = new Metodos();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Histograma");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1320, 640);
        String title = " ";
        String[] labels = new String[256];
        for (int i=0; i<256; i++){
             labels[i]=" ";
        }
        labels[0]="0";
        labels[255]="255";
        
        
        Histograma bc = new Histograma(metodos.histograma(imagem), labels, Color.black, title);
        frame.add(bc);
        frame.setVisible(true);
    }
    
}
