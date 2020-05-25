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

    public BufferedImage grayscaleRed(BufferedImage imagem){
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                Color cor1 = new Color(red,red,red);
                img.setRGB(i, j, cor1.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage grayscaleGreen(BufferedImage imagem){
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i,j));
                int green = cor.getGreen();
                Color cor1 = new Color(green,green,green);
                img.setRGB(i,j,cor1.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage grayscaleBlue(BufferedImage imagem){
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                int blue = cor.getBlue();
                Color cor1 = new Color(blue,blue,blue);
                img.setRGB(i, j, cor1.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage grayscaleMedia(BufferedImage imagem){
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                int somaCor = cor.getRed() + cor.getGreen() + cor.getBlue();
                Color cor1 = new Color(somaCor / 3, somaCor / 3, somaCor / 3);
                img.setRGB(i, j, cor1.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage bandasSeparadasRed(BufferedImage imagem){
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                Color cor1 = new Color(red,0,0);
                img.setRGB(i, j, cor1.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage bandasSeparadasGreen(BufferedImage imagem){
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                int green = cor.getGreen();
                Color cor1 = new Color(0,green,0);
                img.setRGB(i, j, cor1.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage bandasSeparadasBlue(BufferedImage imagem){
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                int blue = cor.getBlue();
                Color cor1 = new Color(0,0,blue);
                img.setRGB(i, j, cor1.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage limiarizacao(BufferedImage imagem, int limiar){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        BufferedImage modMedia = grayscaleMedia(imagem);
        for (int i = 0; i < modMedia.getWidth(); i++) {
            for (int j = 0; j < modMedia.getHeight(); j++) {
                Color cor = new Color(modMedia.getRGB(i, j));
                int red = cor.getRed();
                if (limiar < red) {
                    Color cor2 = new Color(255,255,255);
                    img.setRGB(i,j, cor2.getRGB());
                }
                else if (limiar > red) {
                    Color cor2 = new Color(0,0,0);
                    img.setRGB(i,j, cor2.getRGB());
                }
            }
        }
        return img;
    }
    
    public BufferedImage negativo(BufferedImage imagem){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                               
                int redMod = 255 - red;
                int greenMod = 255 - green;
                int blueMod = 255 - blue;
                
                Color cor2 = new Color(redMod,greenMod,blueMod);
                img.setRGB(i,j, cor2.getRGB());
            }
        }
        return img;
    }
    
    public double [][][] rgbToYIQ(BufferedImage imagem){
        double [][][] matrizYIQ = new double [imagem.getWidth()][imagem.getHeight()][3];
        
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                matrizYIQ [i][j][0] = 0.299 * red + 0.587 * green + 0.114 * blue;
                matrizYIQ [i][j][1] = 0.596 * red - 0.274 * green - 0.322 * blue;
                matrizYIQ [i][j][2] = 0.211 * red - 0.523 * green + 0.312 * blue;
            }
        }
        return matrizYIQ;
    }
    
    
    public BufferedImage yiqToRGB(double matriz [][][], BufferedImage imagem){        
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                double red = 1.000 * matriz[i][j][0] + 0.956 * matriz[i][j][1] + 0.621 * matriz[i][j][2];
                double green = 1.000 * matriz[i][j][0] - 0.272 * matriz[i][j][1] - 0.647 * matriz[i][j][2];
                double blue = 1.000 * matriz[i][j][0] - 1.106 * matriz[i][j][1] + 1.703 * matriz[i][j][2];
                
                if (red > 255) {
                    red = 255;
                }
                if (red < 0){
                    red = 0;
                }
                if (green > 255) {
                    green = 255;
                }
                if (green < 0) {
                    green = 0;
                }
                if (blue > 255) {
                    blue = 255;
                }
                if (blue < 0) {
                    blue = 0;
                }
                Color cor2 = new Color((int) red,(int) green,(int) blue);
                img.setRGB(i,j, cor2.getRGB());
            }
        }
        return img;
    }      
    
    public BufferedImage negativoY(BufferedImage imagem){        
        BufferedImage img =  new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        
        double [][][] yiq = rgbToYIQ(imagem);
        
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                
                yiq[i][j][0] = 255 - yiq[i][j][0];
                
            }
        }
        
        img = yiqToRGB(yiq, imagem);
        return img;
    }
    
    public BufferedImage aditivoRGB(BufferedImage imagem, int brilho){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                
                int red = brilho + cor.getRed();
                int green = brilho + cor.getGreen();
                int blue = brilho + cor.getBlue();
                
                if (red > 255) {
                    red = 255;
                }
                if (green > 255) {
                    green = 255;
                }
                if (blue > 255) {
                    blue = 255;
                }
                
                Color cor2 = new Color(red,green,blue);
                img.setRGB(i,j, cor2.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage aditivoY(BufferedImage imagem, int brilho){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        
        double [][][] yiq = rgbToYIQ(imagem);
        
        for (int a = 0; a < imagem.getWidth(); a++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                
                double y = brilho + yiq[a][j][0];
                
                if (y > 255) {
                    y = 255;
                }
                
                yiq[a][j][0] = y;
            }
        }
        
        img = yiqToRGB(yiq, imagem);
        return img;
    }
    
    public BufferedImage multBrilhoRGB(BufferedImage imagem, double brilho){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        
        for (int i = 0; i < imagem.getWidth(); i++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                
                double red = brilho * cor.getRed();
                double green = brilho * cor.getGreen();
                double blue = brilho * cor.getBlue();
                
                if (red > 255) {
                    red = 255;
                }
                if (green > 255) {
                    green = 255;
                }
                if (blue > 255) {
                    blue = 255;
                }
                
                Color cor2 = new Color((int) red,(int) green,(int) blue);
                img.setRGB(i,j, cor2.getRGB());
            }
        }
        return img;
    }
    
    public BufferedImage multBrilhoY(BufferedImage imagem, double brilho){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);
        
        double [][][] yiq = rgbToYIQ(imagem);
        
        for (int a = 0; a < imagem.getWidth(); a++) {
            for (int j = 0; j < imagem.getHeight(); j++) {
                
                double y = brilho * yiq[a][j][0];
                
                if (y > 255) {
                    y = 255;
                }
                
                yiq[a][j][0] = y;
            }
        }
        
        img = yiqToRGB(yiq, imagem);
        return img;
    }
    
    
    public BufferedImage filtroMedia(BufferedImage imagem, int tamJanela){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
        imagem = grayscaleMedia(imagem);
        
        int area = (tamJanela - 1) / 2;
        for (int i = area; i < imagem.getWidth() - area; i++) {
            for (int j = area; j < imagem.getHeight() - area; j++) {
                int valor = 0;               
                
                for (int k = i - area; k <= i + area; k++) {
                    for (int l = j - area; l <= j + area; l++) {
                       Color cor = new Color(imagem.getRGB(k, l));
                       valor += cor.getRed();
                    }
                }
                int media = valor / (tamJanela * tamJanela);
                Color cor = new Color(media,media,media);
                img.setRGB(i,j, cor.getRGB());                
            }            
        }
        return img;
    }
    
    public BufferedImage filtroMediana(BufferedImage imagem, int tamJanela){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
        imagem = grayscaleMedia(imagem);
        
        int [] pixels = new int [tamJanela * tamJanela];
        
        int area = (tamJanela - 1) / 2;
        for (int i = area; i < imagem.getWidth() - area; i++) {
            for (int j = area; j < imagem.getHeight() - area; j++) {
                
                int cont = 0;
                
                for (int k = i - area; k <= i + area; k++) {
                    for (int l = j - area; l <= j + area; l++) {
                        int cor = new Color(imagem.getRGB(k, l)).getRed();
                        if (cont < pixels.length) {
                            pixels [cont] = cor;
                            cont++;
                        }                       
                    }
                }
                Arrays.sort(pixels);
                int mediana = pixels[((tamJanela * tamJanela) - 1) / 2];
                Color cor = new Color(mediana,mediana,mediana);
                img.setRGB(i,j, cor.getRGB());               
            }
        }
       return img;
    }
    
//    public BufferedImage filtroModa(BufferedImage imagem, int tamJanela){
//        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
//        imagem = grayscaleMedia(imagem);
//        
//        int [] pixels = new int [tamJanela * tamJanela];
//        
//        int area = (tamJanela - 1) / 2;
//        for (int i = area; i < imagem.getWidth() - area; i++) {
//            for (int j = area; j < imagem.getHeight() - area; j++) {
//                
//                int cont = 0;
//                
//                for (int k = i - area; k <= i + area; k++) {
//                    for (int l = j - area; l <= j + area; l++) {
//                        int cor = new Color(imagem.getRGB(k, l)).getRed();
//                        if (cont < pixels.length) {
//                            pixels [cont] = cor;
//                            cont++;
//                        }                       
//                    }
//                }
//                
//                Arrays.sort(pixels);
//                
//                int pixelModa = 0;
//                int numPixelModaRep = 0;
//                
//                for (int x = 0; x < pixels.length - 1; x++) {
//                    int auxPixelRep = 0;
//                    for (int y = x; y < pixels.length; y++) {                       
//                        
//                        if (pixels[x] == pixels[y]) {
//                            auxPixelRep ++;
//                        }
//                    }
//                    if (auxPixelRep > numPixelModaRep) {
//                        numPixelModaRep = auxPixelRep;
//                        pixelModa = pixels[x];
//                    }
//                }
//                Color cor = new Color(pixelModa,pixelModa,pixelModa);
//                img.setRGB(i,j, cor.getRGB());
//            }
//        }
//       return img;
//    }
    
    public BufferedImage filtroModa(BufferedImage imagem, int tamJanela){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
        imagem = grayscaleMedia(imagem);
        
        int [] pixels = new int [tamJanela * tamJanela];
        int area = (tamJanela - 1) / 2;
        int moda = 0;
        int repete = 1;
        int comprara = 0;
        for (int i = area; i < imagem.getWidth() - area; i++) {
            for (int j = area; j < imagem.getHeight() - area; j++) {
                int k = 0;
                int l = 0;
                for (int x = i - area; x <= i + area; x++) {
                    for (int y = j - area; y <= j + area; y++) {
                        pixels[k] = new Color(imagem.getRGB(x, y)).getRed();
                        l = k + 1;
                        k++;
                        if (l < pixels.length) {
                            if (pixels[k] == pixels[l]) {
                                repete++;
                            }
                            if (repete > comprara) {
                                moda = pixels[k];
                                comprara = repete;
                            }
                        }
                        l++;                      
                    }
                }
                Arrays.sort(pixels);
                Color cor = new Color(moda,moda,moda);
                img.setRGB(i,j, cor.getRGB());
            }
        }
       return img;
    }
    
    public BufferedImage filtroMediaColorido(BufferedImage imagem, int tamJanela){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
        
        int area = (tamJanela - 1) / 2;
        for (int i = area; i < imagem.getWidth() - area; i++) {
            for (int j = area; j < imagem.getHeight() - area; j++) {
                int pixelRed = 0;
                int pixelGreen = 0;
                int pixelBlue = 0;
                
                
                for (int k = i - area; k <= i + area; k++) {
                    for (int l = j - area; l <= j + area; l++) {
                       Color cor = new Color(imagem.getRGB(k, l));
                       pixelRed += cor.getRed();
                       pixelGreen += cor.getGreen();
                       pixelBlue += cor.getBlue();
                    }
                }
                int mediaRed = pixelRed / (tamJanela * tamJanela);
                int mediaGreen = pixelGreen / (tamJanela * tamJanela);
                int mediaBlue = pixelBlue / (tamJanela * tamJanela);
                Color pixelP = new Color(mediaRed,mediaGreen,mediaBlue);
                img.setRGB(i,j, pixelP.getRGB());                
            }            
        }
        return img;
    }
    
    public BufferedImage filtroMedianaColorido(BufferedImage imagem, int tamJanela){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
        
        int [] pixelsRed = new int [tamJanela * tamJanela];
        int [] pixelsGreen = new int [tamJanela * tamJanela];
        int [] pixelsBlue = new int [tamJanela * tamJanela];
        
        int area = (tamJanela - 1) / 2;
        for (int i = area; i < imagem.getWidth() - area; i++) {
            for (int j = area; j < imagem.getHeight() - area; j++) {
                
                int cont = 0;
                
                for (int k = i - area; k <= i + area; k++) {
                    for (int l = j - area; l <= j + area; l++) {
                        Color cor = new Color(imagem.getRGB(k, l));
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
                Color cor = new Color(medianaRed,medianaGreen,medianaBlue);
                img.setRGB(i,j, cor.getRGB());               
            }
        }
       return img;
    }
    
    public BufferedImage convolucao(int [] matriz, BufferedImage imagem, int tamJanela){
        BufferedImage img = new BufferedImage(imagem.getWidth(),imagem.getHeight(),1);        
        imagem = grayscaleMedia(imagem);
        
        int area = (tamJanela - 1) / 2;
        
        for (int i = area; i < imagem.getWidth() - area; i++) {
            for (int j = area; j < imagem.getHeight() - area; j++) {          
                int media = 0;
                int valorAlvo = 0;
                int contador = 0;
                int resultado = 0;
                
                int [] matrizPixels = new int [matriz.length];
                
                for (int k = i - area; k <= i + area; k++) {
                    for (int l = j - area; l <= j + area; l++) {                 
                        int pixel = new Color(imagem.getRGB(k, l)).getRed();
                        
                        resultado = matriz[contador] * pixel;
                        if (resultado > 255) {
                            resultado = 255;
                        }
                        matrizPixels[contador] = resultado;
                        contador++;                      
                    }
                }
                for (int k = 0; k < matrizPixels.length; k++) {
                    valorAlvo += matrizPixels[k];
                }
                
                media = valorAlvo / 9;
                Color cor = new Color(media,media,media);
                img.setRGB(i,j, cor.getRGB());                
            }            
        }
        return img;
    }
      
}
