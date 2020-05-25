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

/**
 *
 * @author fafic
 */
public class Metodos {
    
    public void chroma(BufferedImage imagem,int desvio, BufferedImage imagem2) throws IOException{
        int[][][] chroma = new int[imagem.getWidth()][imagem.getHeight()][3];
        
        Color corDoChroma = new Color(imagem.getRGB(0, 0));
        
        int vermelho = corDoChroma.getRed();
        int verde = corDoChroma.getGreen();
        int azul = corDoChroma.getBlue();
        
        for(int i = 0; i<imagem.getWidth();i++){
            for(int j = 0;j<imagem.getHeight();j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                
                if((red <= vermelho+desvio) && (red >= vermelho - desvio) && ((green <= verde+desvio) && (green >= verde - desvio)) && ((blue <=azul+desvio) && (blue >= azul-desvio))){
                    chroma[i][j][0] = red;
                    chroma[i][j][1] = green;
                    chroma[i][j][2] = blue;
                }
                else{
                    chroma[i][j][0] = -1;
                }
            }
        }
        
        for(int x = 0;x<imagem2.getWidth();x++){
            for(int y = 0;y<imagem2.getHeight();y++){
                if(chroma[x][y][0] != -1){
                    Color cor = new Color(imagem2.getRGB(x, y));
                    imagem.setRGB(x, y, cor.getRGB());
                }
            }
        }
        ImageIO.write(imagem, "jpg", new File("novaImagem.jpg"));
    }
    
    public double[] histograma(BufferedImage imagem){
        double[] array = new double[256];
        for(int i = 0;i<imagem.getWidth();i++){
            for(int j = 0;j<imagem.getHeight();j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                array[red]++;
            }
        }
        for(int x = 0;x<array.length;x++){
            array[x] = array[x]/(imagem.getWidth()*imagem.getHeight());
        }
            return array;
    }
    
    public void expansao(BufferedImage imagem, double[] array){
        int a = 0;
        while(array[a]==0){
            a++;
        }
    
        int b = 255;
        while(array[b]==0){
            b--;
        }
    }
    
}
