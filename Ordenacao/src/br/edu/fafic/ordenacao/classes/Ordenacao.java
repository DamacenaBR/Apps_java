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

    // ORDENAÇÃO POR TROCA
    public void ordenacaoPorTroca(int[] desordenado) {
        for (int i = 0; i < desordenado.length - 1; i++) {
            for (int j = i + 1; j < desordenado.length; j++) {
                if (desordenado[i] > desordenado[j]) {
                    int aux = desordenado[i];
                    desordenado[i] = desordenado[j];
                    desordenado[j] = aux;
                }
            }
        }
    }

    // ORDENAÇÃO POR SELEÇÃO
    public void selectionSort(int[] desordenado) {
        for (int i = 0; i < desordenado.length; i++) {
            int menor = desordenado[i];
            int indiceMenor = i;
            for (int j = i + 1; j < desordenado.length; j++) {
                if (desordenado[j] < menor) {
                    menor = desordenado[j];
                    indiceMenor = j;
                }
            }
            desordenado[indiceMenor] = desordenado[i];
            desordenado[i] = menor;
        }
    }

    // ORDENAÇÃO POR INSERÇÃO
    public void insertionSort(int[] desordenado) {
        int aux;
        for (int i = 1; i < desordenado.length; i++) {
            for (int j = i; j > 0; j--) {
                if (desordenado[j] < desordenado[j - 1]) {
                    aux = desordenado[j];
                    desordenado[j] = desordenado [j - 1];
                    desordenado[j - 1] = aux;
                }                
            }
        }
    }
    
    //ORENAÇÃO POR BOLHA
    public void bubbleSort(int[] desordenado) {     
        int aux = 0;
        for (int i = 0; i < desordenado.length; i++) {
            for (int j = 0; j < desordenado.length - 1; j++) {
                if (desordenado[j] > desordenado[i]) {
                    aux = desordenado[j];
                    desordenado[j] = desordenado[i];
                    desordenado[i] = aux;
                }
            }
        }
    }
    
    //ORENAÇÃO POR QUICK SORT
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
    
    //ORENAÇÃO POR RADIX SORT
    public void radixSort(int[] desordenado){
        
    }
    
    public int buscaLinear(int [] desordenado, int elemento){
        for (int i = 0; i < desordenado.length; i++) {
            if (desordenado[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
    
    public int buscaLinear2(int [] desordenado, int elemento){
        int aux = 0;
        for (int i = 0; i < desordenado.length; i++) {
            if (desordenado[i] == elemento) {
                aux++;
            }
        }
        return aux;
    }
    
    public int buscaBinaria(int[] vetor, int inicio, int fim, int valor) {
        int meio = (inicio + fim) / 2;

        if (vetor[meio] == valor) {
            return meio;
        }
        if (inicio >= fim) {
            return -1;
        }
        else if (vetor[meio] < valor) {
            return buscaBinaria(vetor, meio + 1, fim, valor);
        }
        else if (vetor[meio] > valor) {
            return buscaBinaria(vetor, inicio, meio - 1, valor);
        }
        return -1;
    }     
}