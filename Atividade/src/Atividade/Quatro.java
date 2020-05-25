package Atividade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTER
 */
public class Quatro {
    
    public static void main(String[] args) {
        int [] vetorA = new int [10];
        
        vetorA[0] = 4;
        vetorA[1] = 8;
        vetorA[2] = 10;
        vetorA[3] = 12;
        vetorA[4] = 14;
        vetorA[5] = 16;
        vetorA[6] = 18;
        vetorA[7] = 20;
        vetorA[8] = 22;
        vetorA[9] = 24;
        
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            soma = soma + vetorA[i];
        }
        
        System.out.println("Elemento Inteiro Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("VetorA [" + i +"]: " + vetorA[i]);  
        }
        
        System.out.println("Soma dos elementos vetorA: " + soma);
    }
}
