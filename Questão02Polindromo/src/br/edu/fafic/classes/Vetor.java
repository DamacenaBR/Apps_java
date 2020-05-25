/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classes;
/**
 *
 * @author COMPUTER
 */
public class Vetor {
    
    Vetor [] vetor;
    
    public void polindromo(int[] vetor, int inicio, int fim){          
        int i, j;
        int aux = 0;
        
        i = inicio;
        j = fim;
        
        while(i < j){
            while(i < j){
                i++;
                break;
            }
            while(j > i){
                j--;
                break;
            }
            if (vetor[i] == vetor[j]) {
                aux++;
            }
        }
        if (aux == 5) {
            System.out.println("É um polídromo");
        } else {
            System.out.println("Não é um polidromo");
        }
    }
}
