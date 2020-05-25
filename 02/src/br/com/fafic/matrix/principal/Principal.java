/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.matrix.principal;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] valores = new int [5][5];
       
        valores[0][0] = 71;
        valores[0][1] = 85;
        valores[0][2] = 65;
        valores[0][3] = 58;
        valores[0][4] = 19;
        
        valores[1][0] = 32;
        valores[1][1] = 84;
        valores[1][2] = 22;
        valores[1][3] = 67;
        valores[1][4] = 14;
        
        valores[2][0] = 24;
        valores[2][1] = 87;
        valores[2][2] = 12;
        valores[2][3] = 98;
        valores[2][4] = 15;
        
        valores[3][0] = 52;
        valores[3][1] = 66;
        valores[3][2] = 41;
        valores[3][3] = 58;
        valores[3][4] = 87;
        
        valores[4][0] = 51;
        valores[4][1] = 42;
        valores[4][2] = 28;
        valores[4][3] = 59;
        valores[4][4] = 61;
        
        int valorMenor = valores[3][0];
        for (int i = 0; i < valores.length; i++) {
            System.out.println(i);
            for (int j = 0; j < valores[i].length; j++) {
                if (valores[3][j] < valorMenor) {
                    valorMenor = valores[3][j];
                }
            }
        }
        System.out.println("Menor valor da linha 4: " + valorMenor);
        
        int ValorMaior = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                if (valores[i][4] > ValorMaior) {
                    ValorMaior = valores[i][4];
                }
            }
        }
        System.out.println("Maior valor da coluna 5: " + ValorMaior);
        
        
}
        
        
    }
    
}
