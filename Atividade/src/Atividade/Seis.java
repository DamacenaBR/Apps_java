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
public class Seis {
    
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
        
        int cont = 0;
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                soma = soma + vetorA[i];
                cont ++;
            }
        }
        
        float media = soma / cont;
        
        System.out.println("Media dos elementos impares do vetorA: " + media);
    }
}
