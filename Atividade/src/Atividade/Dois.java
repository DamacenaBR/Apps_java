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
public class Dois {
    
    public static void main(String[] args) {
        int [] vetorA = new int [8];
        int [] vetorB = new int [8];
        
        vetorA[0] = 4;
        vetorA[1] = 8;
        vetorA[2] = 10;
        vetorA[3] = 12;
        vetorA[4] = 14;
        vetorA[5] = 16;
        vetorA[6] = 18;
        vetorA[7] = 20;
        
        System.out.println("Elemento Inteiro: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("VetorA [" + i +"]: " + vetorA[i]);  
        }
        
        int index = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorB [i] = (int) vetorA[i] * index;
            index ++;
        }
        
        System.out.println("Elemento Multiplicado por sua posição: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("VetorB [" + i +"]: " + vetorB[i]);  
        }
    }
}
