/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfacePDI.Interface;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author COMPUTER
 */
public class Manipulacao {
    
    int [][] matrizBorda;
    
    public void salvar(BufferedImage resultado){
        JFileChooser salvar = new JFileChooser();
        salvar.setFileFilter(new FileNameExtensionFilter(".jpg", "jpg"));
        salvar.setAcceptAllFileFilterUsed(false);
        int res = salvar.showSaveDialog(null);
        if(res == JFileChooser.APPROVE_OPTION){
            try {
                String caminho = String.valueOf(salvar.getSelectedFile());
                ImageIO.write(resultado, "jpg", new File(caminho + salvar.getFileFilter().getDescription()));
            } catch (IOException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
    public String escolherImagem(){
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = file.showOpenDialog(null);
        if (i == 0) {
            File f = file.getSelectedFile();            
            return f.getPath();
        }
        else if (i == 1){
            return null;
        }
        return null;
    }
    
//    public BufferedImage chromaKey (BufferedImage imagemRecorte, BufferedImage imagemFundo){
//        BufferedImage img =  new BufferedImage(imagemRecorte.getWidth(),imagemRecorte.getHeight(),1);
//        for (int i = 0; i < imagemRecorte.getWidth(); i++) {
//            for (int j = 0; j < imagemRecorte.getHeight(); j++) {
//                
//                Color corRecorte = new Color(imagemRecorte.getRGB(i, j));                
//                int redRecorte = corRecorte.getRed();
//                int greenRecorte = corRecorte.getGreen();
//                int blueRecorte = corRecorte.getBlue();
//                
//                if (redRecorte <= 210 && greenRecorte >= 183 && blueRecorte <= 140) {
//                    
//                    Color corFundo = new Color(imagemFundo.getRGB(i, j));
//                    int redFundo = corFundo.getRed();
//                    int greenFundo = corFundo.getGreen();
//                    int blueFundo = corFundo.getBlue();
//                    
//                    img.setRGB(i,j, new Color(redFundo,greenFundo,blueFundo).getRGB());
//                }
//                else{
//                    img.setRGB(i,j, new Color(redRecorte,greenRecorte,blueRecorte).getRGB());
//                }
//            }                
//        }
//        return img;
//    }
    
//    public BufferedImage filtroMedianaColorido(BufferedImage imagem, int tamJanela){
//        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
//        
//        int [] pixelsRed = new int [tamJanela * tamJanela];
//        int [] pixelsGreen = new int [tamJanela * tamJanela];
//        int [] pixelsBlue = new int [tamJanela * tamJanela];
//        
//        int area = (tamJanela - 1) / 2;
//        for (int i = area; i < imagem.getWidth() - area; i++) {
//            for (int j = area; j < imagem.getHeight() - area; j++) {
//                
//                Color cor1 = new Color(imagem.getRGB(i, j));
//                int red = cor1.getRed();
//                int green = cor1.getGreen();
//                int blue = cor1.getBlue();               
//
//                if ((red < 50 && green > 50 && blue < 50)) {
//                    int cont = 0;
//                
//                    for (int k = i - area; k <= i + area; k++) {
//                        for (int l = j - area; l <= j + area; l++) {
//                            Color cor = new Color(imagem.getRGB(k, l));
//                            if (cont < pixelsRed.length) {
//                                pixelsRed [cont] = cor.getRed();
//                                pixelsGreen [cont] = cor.getGreen();
//                                pixelsBlue [cont] = cor.getBlue();
//                                cont++;
//                            }                       
//                        }
//                    }
//                    Arrays.sort(pixelsRed);
//                    Arrays.sort(pixelsGreen);
//                    Arrays.sort(pixelsBlue);
//                    
//                    int medianaRed = pixelsRed[((tamJanela * tamJanela) - 1) / 2];
//                    int medianaGreen = pixelsGreen[((tamJanela * tamJanela) - 1) / 2];
//                    int medianaBlue = pixelsBlue[((tamJanela * tamJanela) - 1) / 2];
//                    
//                    img.setRGB(i,j, new Color(medianaRed,medianaGreen,medianaBlue).getRGB());   
//                }
//                else{
//                    img.setRGB(i,j, new Color(red,green,blue).getRGB());  
//                }            
//            }
//        }
//       return img;
//    }
    
//    public BufferedImage chromaKey (BufferedImage imagemRecorte, BufferedImage imagemFundo){
//        BufferedImage img =  new BufferedImage(imagemRecorte.getWidth(),imagemRecorte.getHeight(),1);
//        for (int i = 0; i < imagemRecorte.getWidth(); i++) {
//            for (int j = 0; j < imagemRecorte.getHeight(); j++) {
//                
//                Color cor1 = new Color(imagemRecorte.getRGB(i, j));
//                int redRecorte = cor1.getRed();
//                int greenRecorte = cor1.getGreen();
//                int blueRecorte = cor1.getBlue();
//                
//                //teste de cor verde
//                if ((redRecorte <= 210 && greenRecorte >= 183 && blueRecorte <= 140)) {
//                   
//                    Color cor = new Color(imagemFundo.getRGB(i, j));
//                    int redFundo = cor.getRed();
//                    int greenFundo = cor.getGreen();
//                    int blueFundo = cor.getBlue();
//                    
//                    Color cor2 = new Color(redFundo,greenFundo,blueFundo);
//                    img.setRGB(i,j, cor2.getRGB());
//                }
//                else{
//                    Color cor3 = new Color(redRecorte,greenRecorte,blueRecorte);
//                    img.setRGB(i,j, cor3.getRGB());
//                }
//            }
//        }
//        return img;
//    }

    
    
//    public BufferedImage chromaKey (BufferedImage imagemRecorte, BufferedImage imagemFundo){
//        BufferedImage img =  new BufferedImage(imagemRecorte.getWidth(),imagemRecorte.getHeight(),1);
//        for (int i = 0; i < imagemRecorte.getWidth(); i++) {
//            for (int j = 0; j < imagemRecorte.getHeight(); j++) {
//                
//                Color cor1 = new Color(imagemRecorte.getRGB(i, j));
//                int redRecorte = cor1.getRed();
//                int greenRecorte = cor1.getGreen();
//                int blueRecorte = cor1.getBlue();
//                //System.out.println(redRecorte + "," + greenRecorte + ", " + blueRecorte);
//                if ((redRecorte <= 174 && greenRecorte >= 172 && blueRecorte <= 140)) {
//                   
//                    Color cor = new Color(imagemFundo.getRGB(i, j));
//                    int redFundo = cor.getRed();
//                    int greenFundo = cor.getGreen();
//                    int blueFundo = cor.getBlue();
//                    
//                    Color cor2 = new Color(redFundo,greenFundo,blueFundo);
//                    img.setRGB(i,j, cor2.getRGB());
//                }
//                else{
//                    Color cor3 = new Color(redRecorte,greenRecorte,blueRecorte);
//                    img.setRGB(i,j, cor3.getRGB());
//                }
//            }
//        }
//        return img;
//    }
    
    
    
    public BufferedImage chromaKey (BufferedImage imagemRecorte, BufferedImage imagemFundo){
        
        matrizBorda = new int[imagemFundo.getWidth() * imagemFundo.getHeight()][2];
        int cont = 0;
        BufferedImage img =  new BufferedImage(imagemRecorte.getWidth(),imagemRecorte.getHeight(),1);
        
        for (int i = 0; i < imagemRecorte.getWidth(); i++) {
            for (int j = 0; j < imagemRecorte.getHeight(); j++) {
                
                Color corRecorte = new Color(imagemRecorte.getRGB(i, j));                
                int redRecorte = corRecorte.getRed();
                int greenRecorte = corRecorte.getGreen();
                int blueRecorte = corRecorte.getBlue();
                
                if (redRecorte <= 210 && greenRecorte >= 183 && blueRecorte <= 140) {
                   
                    Color corFundo = new Color(imagemFundo.getRGB(i, j));
                    int redFundo = corFundo.getRed();
                    int greenFundo = corFundo.getGreen();
                    int blueFundo = corFundo.getBlue();
                    
                    img.setRGB(i,j, new Color(redFundo,greenFundo,blueFundo).getRGB());
                }
                else{                    
                    img.setRGB(i,j, new Color(redRecorte,greenRecorte,blueRecorte).getRGB());
                    Color teste1 = new Color(imagemRecorte.getRGB(i, j - 1));                    
                    int red = teste1.getRed();
                    int green = teste1.getGreen();
                    int blue = teste1.getBlue();
                    
                    Color teste2 = new Color(imagemRecorte.getRGB(i, j + 1));                    
                    int red1 = teste2.getRed();
                    int green1 = teste2.getGreen();
                    int blue1 = teste2.getBlue();
                    
                    if ((red <= 210 && green >= 100 && blue <= 140)) {
                        matrizBorda[cont][0] = i;
                        matrizBorda[cont][1] = j;
                        cont++;
                    }
                    else if (red1 <= 210 && green1 >= 100 && blue1 <= 140) {
                        matrizBorda[cont][0] = i;
                        matrizBorda[cont][1] = j;
                        cont++;
                    }
                }
            }                
        }
        return img;
    }
    
    public BufferedImage filtroMedianaColorido(BufferedImage imagem, int tamJanela){
        BufferedImage img = imagem;        
        
        int [] pixelsRed = new int [tamJanela * tamJanela];
        int [] pixelsGreen = new int [tamJanela * tamJanela];
        int [] pixelsBlue = new int [tamJanela * tamJanela];
        
        int area = (tamJanela - 1) / 2;
        for (int i = 0; i < matrizBorda.length; i++) {
               
            int cont = 0;
                    
            if (matrizBorda[i][0] != 0) {
                
                for (int k = matrizBorda[i][0] - area; k <= matrizBorda[i][0] + area; k++) {
                    for (int l = matrizBorda[i][1] - area; l <= matrizBorda[i][1] + area; l++) {
                        Color cor = new Color(img.getRGB(k, l));
                        if (cont < pixelsRed.length) {
                            pixelsRed [cont] = cor.getRed();
                            pixelsGreen [cont] = cor.getGreen();
                            pixelsBlue [cont] = cor.getBlue();
                            cont++;
                        }                       
                    }
                }
                Arrays.sort(pixelsRed);
                Arrays.sort(pixelsGreen);
                Arrays.sort(pixelsBlue);

                int medianaRed = pixelsRed[((tamJanela * tamJanela) - 1) / 2];
                int medianaGreen = pixelsGreen[((tamJanela * tamJanela) - 1) / 2];
                int medianaBlue = pixelsBlue[((tamJanela * tamJanela) - 1) / 2];

                img.setRGB(matrizBorda[i][0],matrizBorda[i][1], new Color(medianaRed,medianaGreen,medianaBlue).getRGB());   
                           
            }
            else{
                break;    
            }
        }
       return img;
    }
    
    
}
