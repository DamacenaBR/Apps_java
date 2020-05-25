/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.principal;

import br.edu.fafic.classes.Vetor;
import java.util.Arrays;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        Vetor v = new Vetor();

        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;
        vetor[5] = 5;
        vetor[6] = 4;
        vetor[7] = 3;
        vetor[8] = 2;
        vetor[9] = 1;
        
        System.out.println(Arrays.toString(vetor));
        v.polindromo(vetor, 0, 9);
        
        System.out.println();
        
        vetor[0] = 4;
        vetor[1] = 3;
        vetor[2] = 3; // Números diferentes não é um palíndromo
        vetor[3] = 4; 
        vetor[4] = 5;
        vetor[5] = 5;
        vetor[6] = 4;
        vetor[7] = 5; // Números Dierentes não é um palíndromo
        vetor[8] = 3;
        vetor[9] = 4;
        
        System.out.println(Arrays.toString(vetor));
        v.polindromo(vetor, 0, 9);       
    }
}
