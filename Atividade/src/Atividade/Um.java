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
public class Um {

    public static void main(String[] args) {
        int [] vetorA = new int[5];
        int [] vetorB = new int [5];
        
        vetorA[0] = 4;
        vetorA[1] = 25;
        vetorA[2] = 16;
        vetorA[3] = 81;
        vetorA[4] = 36;
        
        System.out.println("Elemento Inteiro: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("VetorA [" + i +"]: " + vetorA[i]);  
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = (int) Math.sqrt(vetorA[i]);
        }
        
        System.out.println("Elemento Raiz Quadrada: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("VetorB [" + i +"]: " + vetorB[i]);  
        }
    }            
}
