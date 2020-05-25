/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopdi;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Familia
 */
public class Metodos {
    public void imagemPreta(){
        Color cor = new Color(0,0,0);
        int corPreta = cor.getRGB();
        try {
            BufferedImage original = ImageIO.read(new File("santos.jpg"));
            for(int i = 0;i<original.getWidth();i++){
                for(int j = 0;j<original.getHeight();j++){
                    original.setRGB(i, j, corPreta);
                }
            }
            ImageIO.write(original, "jpg", new File("preto.jpg"));
        } catch (IOException ex) {
            System.out.println("Tem parada errada aí irmão!");
        }
    }
    public void imagemBranca(){
        Color cor = new Color(255,255,255);
        int corBranca = cor.getRGB();
        try {
            BufferedImage original = ImageIO.read(new File("santos.jpg"));
            for(int i = 0;i<original.getWidth();i++){
                for(int j = 0;j<original.getHeight();j++){
                    original.setRGB(i, j, corBranca);
                }
            }
            ImageIO.write(original, "jpg",new File("branco.jpg"));
        } catch (IOException ex) {
            System.out.println("Tem parada errada aí irmão");
        }
    }
    public void imagemTonsDeCinza(){
        try {
            BufferedImage original = ImageIO.read(new File("santos.jpg"));
            for(int i = 0;i<original.getWidth();i++){
                for(int j = 0;j<original.getHeight();j++){
                    int rgb = original.getRGB(i, j);
                    Color cinza = new Color(rgb);
                    
                    int red = cinza.getRed();
                    int green = cinza.getGreen();
                    int blue = cinza.getBlue();
                    
                    int escalaCinza = red+green+blue;
                    escalaCinza = escalaCinza/3;
                    
                    Color novoCinza = new Color(escalaCinza,escalaCinza,escalaCinza);
                    original.setRGB(i, j, novoCinza.getRGB());
                }
            }
            ImageIO.write(original, "jpg", new File("cinza.jpg"));
        } catch (IOException ex) {
            System.out.println("Tem parada errada aí irmão");
        }
    }
    public void mostrarOriginal(){
        try {
            BufferedImage original = ImageIO.read(new File("santos.jpg"));
            Image modificada = original.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            JFrame frame = new JFrame("Imagem Original");
            JLabel label = new JLabel(new ImageIcon(modificada));
            JPanel painel = new JPanel();
            painel.add(label);
            frame.add(painel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
     }
    
    public void mostrarModificadas(){
        try {
            BufferedImage modificada1 = ImageIO.read(new File("preto.jpg"));
            Image menor1 = modificada1.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            BufferedImage modificada2 = ImageIO.read(new File("branco.jpg"));
            Image menor2 = modificada2.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            BufferedImage modificada3 = ImageIO.read(new File("cinza.jpg"));
            Image menor3 = modificada3.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            JFrame frame = new JFrame("Imagens Mdificadas");
            JLabel label1 = new JLabel(new ImageIcon(menor1));
            JLabel label2 = new JLabel(new ImageIcon(menor2));
            JLabel label3 = new JLabel(new ImageIcon(menor3));
            JPanel painel = new JPanel();
            painel.add(label1);
            painel.add(label2);
            painel.add(label3);
            frame.add(painel);
            frame.setSize(600, 600);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Tem parada errada aí irmão");
        }
    }
}
