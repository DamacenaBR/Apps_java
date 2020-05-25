/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade;

/**
 *
 * @author COMPUTER
 */
public class Sete {
    public static void main(String[] args) {
        int [] vetorA = new int [10];
        
        vetorA[0] = 4;
        vetorA[1] = 8;
        vetorA[2] = 15;
        vetorA[3] = 12;
        vetorA[4] = 13;
        vetorA[5] = 16;
        vetorA[6] = 25;
        vetorA[7] = 18;
        vetorA[8] = 21;
        vetorA[9] = 30;
        
        System.out.println("Elemento Inteiro Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("VetorA [" + i +"]: " + vetorA[i]);  
        }
        
        int impar = 0;
        int par = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar ++;
            } 
            if (vetorA[i] % 2 == 0) {
                par ++;
            }
        }
        
        float percentualImpar = ((par * 100)/vetorA.length);
        System.out.println("percentual dos elementos impares do vetorA: " + percentualImpar+ "%");
        
        float percentualPar = ((impar * 100)/vetorA.length);
        System.out.println("percentual dos elementos pates do vetorA: " + percentualPar + "%");
        
    }
    
}
