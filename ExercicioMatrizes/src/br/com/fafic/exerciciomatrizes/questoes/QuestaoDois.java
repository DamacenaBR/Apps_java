/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.exerciciomatrizes.questoes;

/**
 *
 * @author gutemberg
 */
public class QuestaoDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] valores = new int[5][5];
        
        valores[0][0] = 10;
        valores[0][1] = 2;
        valores[0][2] = 8;
        valores[0][3] = 4;
        valores[0][4] = 0;
        
        valores[1][0] = 3;
        valores[1][1] = 7;
        valores[1][2] = 50;
        valores[1][3] = 4;
        valores[1][4] = 12;
        
        valores[2][0] = 1;
        valores[2][1] = 4;
        valores[2][2] = 7;
        valores[2][3] = 2;
        valores[2][4] = 80;
        
        valores[3][0] = 9109;
        valores[3][1] = 1539;
        valores[3][2] = 769;
        valores[3][3] = 519;
        valores[3][4] = 388;
        
        valores[4][0] = 12;
        valores[4][1] = 5;
        valores[4][2] = 67;
        valores[4][3] = 99;
        valores[4][4] = 100;
        
        int menorValorLinha = valores[3][0];
        int maiorValorColuna = 0;
        
        for(int i = 0; i < valores.length; i++){
            
            for(int j = 0; j < valores[i].length; j++){
                
                if(menorValorLinha > valores[3][j]){
                    menorValorLinha = valores[3][j];
                }
               
                
                if(valores[i][4] > maiorValorColuna){
                    maiorValorColuna = valores[i][4];
                }
                
            }

        }
        
        System.out.println("Menor valor da linha 4: " + menorValorLinha);
        System.out.println("Maior valor da coluna 5: " + maiorValorColuna);
        
    }
    
}
