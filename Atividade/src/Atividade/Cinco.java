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
public class Cinco {
    
    public static void main(String[] args) {
        int [] vetorA = new int [10];
        
        vetorA[0] = 4;
        vetorA[1] = 8;
        vetorA[2] = 15;
        vetorA[3] = 12;
        vetorA[4] = 20;
        vetorA[5] = 16;
        vetorA[6] = 25;
        vetorA[7] = 18;
        vetorA[8] = 22;
        vetorA[9] = 30;
        
        System.out.println("Elemento Inteiro Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("VetorA [" + i +"]: " + vetorA[i]);  
        }
        
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                soma = soma + vetorA[i];
            }
        }
        
        System.out.println("Soma dos multiplos de 5 do vetorA: " + soma);
        
        
    }
}
