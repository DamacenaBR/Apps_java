/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.ordenacao.classes;

import java.util.Arrays;

/**
 *
 * @author danyllo
 */
public class RadixSort {

    public static void radixSort(int[] desordenado, int bits){
        
        int[] vetor = new int[desordenado.length];
        int[] vetorOrig = vetor;
        
        int aux = 0;
        for( int i = (-1 << bits); i !=0; i <<= bits, aux += bits){
            int[] contArray = new int [1 << bits];
            
            for( int j = 0; j < desordenado.length; j++){
                int chave = (desordenado[j] & i) >> aux;
                contArray[chave]++;
            }
            
            for( int k = 1; k < contArray.length; k++){
                contArray[k] += contArray[k-1];
            }
            
            for (int k = desordenado.length-1; k >= 0; k--){
                int chave = (desordenado[k] & i) >> aux;
                contArray[chave]--;
                vetor[contArray[chave]] = desordenado[k];
            }
            
            int [ ] temp = vetor;
            vetor = desordenado; 
            desordenado = temp;
        }    
        if (desordenado == vetorOrig){
            System.arraycopy(desordenado,0, vetor, 0, desordenado.length);
        } 
    }
    
    public static void main(String[] args) {
             
        int [] vetor = {83, 75, 96, 8, 99, 419, 793, 57};
        
        //EXECUÇÃO RADIX SORT
        System.out.println("Ordenação por Radix Sort!!!");
        System.out.println("Vetor desordeando!");
        System.out.println(Arrays.toString(vetor));
        radixSort(vetor, 5);
        System.out.println("Vetor Ordenado!");
        System.out.println(Arrays.toString(vetor));
        //FIM EXECUÇÃO RADIX SORT
       
    }

}
