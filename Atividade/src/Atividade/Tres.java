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
public class Tres {
    
    public static void main(String[] args) {
        int [] vetorA = new int [8];
        int [] vetorB = new int [8];
        int [] vetorC = new int [8];
        
        vetorA[0] = 4;
        vetorA[1] = 8;
        vetorA[2] = 10;
        vetorA[3] = 12;
        vetorA[4] = 14;
        vetorA[5] = 16;
        vetorA[6] = 18;
        vetorA[7] = 20;
        
        vetorB[0] = 3;
        vetorB[1] = 5;
        vetorB[2] = 7;
        vetorB[3] = 9;
        vetorB[4] = 11;
        vetorB[5] = 13;
        vetorB[6] = 15;
        vetorB[7] = 17;

        System.out.println("Elemento Inteiro Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("VetorA [" + i +"]: " + vetorA[i]);  
        }
        
        System.out.println("Elemento Inteiro Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("VetorB [" + i +"]: " + vetorB[i]);  
        }
        
        System.out.println("Elemento Vetor C: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }
            
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("VetorA[" + i +"]" + " + VetorB[" + i + "]: "+ vetorC[i]);  
        }
    }
        
}



