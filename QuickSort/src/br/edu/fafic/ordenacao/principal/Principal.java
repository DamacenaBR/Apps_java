/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.ordenacao.principal;

import br.edu.fafic.ordenacao.classes.Ordenacao;
import java.util.Arrays;

/**
 *
 * @author danyllo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        int[] vetor = new int[5];
        vetor[0] = 8;
        vetor[1] = 2;
        vetor[2] = 9;
        vetor[3] = 4;
        vetor[4] = 7;
        
        Ordenacao ord = new Ordenacao();
        
        System.out.println("Ordenação por Quick Sort!!");
        System.out.println(Arrays.toString(vetor));
        ord.quickSort(vetor,0,vetor.length - 1);
        System.out.println(Arrays.toString(vetor));
    }

}
