/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.ordenacao.classes;

import java.util.Arrays;

/**
 *
 * @author COMPUTER
 */
public class HeapSort {
  
    private static void ordenarVetor (int [] desordenado) {
        montarArvore (desordenado);        
        int tamVetor = desordenado.length;
        
        for (int i = desordenado.length - 1; i >= 0; i--) {
            int aux = desordenado[i];
            desordenado [i] = desordenado[0];
            desordenado [0] = aux;            
            ordenarArvore (desordenado, 0, --tamVetor);
        }    
    }
    public static void montarArvore (int [] desordenado){       
        for (int  j = (desordenado.length - 1) / 2; j >= 0; j--)  {           
            ordenarArvore (desordenado , j, desordenado.length );           
        }       
    }
    public static void ordenarArvore ( int [] desordenado, int posicao, int tamVetor){ 
        int index = ((posicao * 2) + 1);        
        
        if (index < tamVetor) {
            if (desordenado [index] > desordenado [posicao]) {    
                int aux = desordenado [index];
                desordenado [index] = desordenado [posicao];
                desordenado [posicao] = aux;
            }
        }       
    }
    
    public static void main(String[] args) {
        
        int [] vetor = {12, 7, 6, 10}; 
        
        //EXECUÇÃO HEAP SORT
        System.out.println("Ordenação por Radix Sort!!!");
        System.out.println("Vetor desordeando!");
        System.out.println(Arrays.toString(vetor));
        ordenarVetor(vetor);
        System.out.println("Vetor Ordenado!");
        System.out.println(Arrays.toString(vetor));
        //FIM EXECUÇÃO HEAP SORT      
    }
}
