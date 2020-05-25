/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author COMPUTER
 */
public class Ordenacao {
    private Aluno Aluno;
    
    public void ordenacaoPorTroca(Aluno [] desordenado){
        for (int i = 0; i < desordenado.length - 1; i++) {
            for (int j = i + 1; j < desordenado.length; j++) {
                if (desordenado[j].getMatricula() < desordenado[i].getMatricula()) {
                    Aluno aux = desordenado[j];
                    desordenado[j] = desordenado[i];
                    desordenado[i] = aux;
                }
            }
        }
    }
    
    
    
    public void selectionSort(Aluno [] desordenado){
        for (int i = 0; i < desordenado.length - 1; i++) {
            Aluno menor = desordenado[i];
            int indexMenor = i;
            for (int j = i + 1; j < desordenado.length; j++) {
                if (desordenado[j].getMatricula() < menor.getMatricula()) {
                    menor = desordenado[j];
                    indexMenor = j;
                }
            }
            desordenado[indexMenor] = desordenado[i];
            desordenado[i] = menor;
        }
    }
    
    public void insectionSort(int [] desordenado){
        int aux;
        for (int i = 1; i < desordenado.length; i++) {
            for (int j = i; j > 0; j--) {
                if (desordenado[j - 1] > desordenado[j]) {
                    aux = desordenado[j];
                    desordenado[j] = desordenado[j - 1];
                    desordenado[j - 1] = aux;
                }
            }
        }
    }
    
    public void bubbleSort(int [] desordenado){
        int aux;
        for (int i = desordenado.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (desordenado[j] > desordenado[i]) {
                    aux = desordenado[j];
                    desordenado[j] = desordenado[i];
                    desordenado[i] = aux;
                }
            }
        }
    }

    public void quickSort(int [] desordeando, int inicio, int fim){
        int i, j, aux, pivo;
        i = inicio;
        j = fim;
        pivo = desordeando[(inicio + fim) / 2];
        
        while(i <= j){
            while(desordeando[i] < pivo){
                i++;
            }
            while(desordeando[j] > pivo){
                j--;
            }
            if (i <= j) {
                aux = desordeando[j];
                desordeando[j] = desordeando[i];
                desordeando[i] = aux;
                i++;
                j--;
            }
        }
        if (inicio < j) {
            quickSort(desordeando, inicio, j);
        }
        else if (inicio < fim) {
            quickSort(desordeando, i, fim);
        }
    }
    
    public int buscaBinaria(int [] vetor, int inicio, int fim, int valor){
        int meio = (inicio + fim) /2;
        
        if (vetor[meio] == valor) {
            return meio;
        }
        if (vetor[meio] < valor) {
            return buscaBinaria(vetor, meio + 1, fim, valor);
        }
        else if (vetor[meio] > valor) {
            return buscaBinaria(vetor, inicio, meio - 1, valor);
        }
        return -1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public int buscaBinaria(int [] vetor, int inicio, int fim, int valor){
//        int meio = (inicio + fim) / 2;
//        
//        if (vetor[meio] == valor) {
//            return meio;
//        }
//        
//        if (inicio >= fim) {
//            return -1;
//        }
//        else if (vetor[meio] < valor) {
//            return buscaBinaria(vetor, inicio + 1, fim, valor);
//        }
//        else if (vetor[meio] > valor) {
//            return buscaBinaria(vetor, inicio, fim - 1, valor);
//        }
//        return -1;
//    }   
//    
//    public void quickSort(int [] desordenado, int inicio, int fim){
//        int i, j, pivo, aux;        
//        i = inicio;
//        j = fim;
//        pivo = desordenado[(inicio + fim) / 2];
//        
//        while(i <= j){           
//            while (desordenado[i] < pivo) {
//                i++;
//            }
//            while(desordenado[j] > pivo){
//                j--;
//            }
//
//            if (i <= j) {
//                aux = desordenado[j];
//                desordenado[j] = desordenado[i];
//                desordenado[i] = aux;
//                i++;
//                j--;
//            }            
//            if (inicio < j) {
//                quickSort(desordenado, inicio, j);
//            }
//            else if (inicio < fim) {
//                quickSort(desordenado, i, fim);
//            }
//        }
//    }
//    
//    public void orndençãoPorTroca(Aluno [] desordenado){
//        for (int i = 0; i < desordenado.length - 1; i++) {
//            for (int j = i + 1; j < desordenado.length; j++) {
//                if (desordenado[i].getMatricula() > desordenado[j].getMatricula()) {
//                    Aluno aux = desordenado[j];
//                    desordenado[j] = desordenado[i];
//                    desordenado[i] = aux;
//                }
//            }
//        }
//    }
//    
//    public void selectionSort(Aluno [] desordenado){
//        for (int i = 0; i < desordenado.length - 1; i++) {
//            Aluno menor = desordenado[i];
//            int indiceMenor = i;
//            for (int j = i + 1; j < desordenado.length;j++) {
//                if (menor.getMatricula() > desordenado[j].getMatricula()) {
//                    menor = desordenado[j];
//                    indiceMenor = j;
//                }
//            }
//            desordenado[indiceMenor] = desordenado[i];
//            desordenado[i] = menor;            
//        }
//    }
//    
//    public void insertionSort(int [] desordenado){
//        int aux;
//        for (int i = 1; i < desordenado.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (desordenado[j - 1] > desordenado[j]) {
//                    aux = desordenado[j];
//                    desordenado[j] = desordenado[j - 1];
//                    desordenado[j - 1] = aux; 
//                }  
//            }
//        }
//    }
//    
//    public void bubbleSort(int [] desordenado){
//        int aux  = 0;
//        for (int i = desordenado.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (desordenado[j] > desordenado[i]) {
//                    aux = desordenado[j];
//                    desordenado[j] = desordenado[i];
//                    desordenado[i] = aux;
//                }
//            }
//        }
//    }
}
