/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.ordenacao.classes;

/**
 *
 * @author danyllo
 */
public class Ordenacao {
    
    public void quickSort(int[] desordenado, int inicio, int fim){          
        int i, j, pivo, aux;
        
        i = inicio;
        j = fim;
        pivo = desordenado[(inicio + fim) / 2];
        
        while(i <= j){
            while(desordenado[i] < pivo){
                i++;  
            }
            while(desordenado[j] > pivo){
                j--;
            }
            if (i <= j) {
                aux = desordenado[i];
                desordenado[i] = desordenado[j];
                desordenado[j] = aux;
                i++;
                j--;
            }
        }
        if (inicio < j) {
            quickSort(desordenado, inicio, j);
        }
        if (inicio < fim) {
            quickSort(desordenado, i, fim);
        }
    }
}