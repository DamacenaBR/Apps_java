/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagempdi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try {
            BufferedImage imagem = ImageIO.read(new File("D:\\Area de Trabalho\\imagemPDI\\minion.jpg"));
            ImageIO.write(imagem, "jpg", new File("D:\\Area de Trabalho\\imagemPDI\\imagemSalvoPDI.jpg"));
            
            JFrame frame = new JFrame();
            JLabel label = new JLabel(new ImageIcon(imagem));
            frame.getContentPane().add(label, BorderLayout.CENTER);
            
            JLabel label2 = new JLabel("Pixels: " + imagem.getWidth() * imagem.getHeight());
            frame.add(label2, BorderLayout.PAGE_END);
            
            frame.pack();
            frame.setVisible(true);
            
            Color cor = new Color(imagem.getRGB(0,0));
            
            System.out.println("Azul: " + cor.getBlue());
            System.out.println("Vermelho: " + cor.getRed());
            System.out.println("Verde: " + cor.getGreen());
            
            Color cor2 = new Color(255,255,255);
            
            imagem.setRGB(0,0, cor2.getRGB());
            
            ImageIO.write(imagem, "jpg", new File("D:\\Area de Trabalho\\imagemPDI\\alterada.jpg"));
            
        } catch (IOException e) {
            
        }
        
        
    }
    
}
