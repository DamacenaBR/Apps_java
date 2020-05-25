/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Arrays;

/**
 *
 * @author COMPUTER
 */
public class Vetor {
    
    public int maiorValor(int [] vetor){
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
    
    public int menorValor(int [] vetor){
        int menor = maiorValor(vetor);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor && vetor[i] != 0) {
                menor = vetor[i];
            }
        }
        return menor;
    }
    
    public void removerMenor(int [] vetor){
        int menor = maiorValor(vetor);
        int index = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor && vetor[i] != 0) {
                menor = vetor[i];
                index = i;
            }
        }
        vetor[index] = 0;
    }
    
    public int valorMeio(int [] vetor){
        int [] vetor1 = vetor;
        int pivo = vetor.length / 2;
        
        int i = 0;
        while(i <= pivo){
            if (i < pivo) {
                removerMenor(vetor1);
            }
            else{
                return menorValor(vetor1);
            }
            i++;
        }
        return 0;
    }
    
    int c1 = 1,c2 = 1,c5 = 1;
    int c3 = 0,c4 = 0;
    int melhorCaso,piorCaso = 0;
    public int calcSoma(int [] vetor, int n){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            c2++;
            c3++;
            if (vetor[i] > 0) {
                soma += vetor[i];
                c4++;
            }
        }
        int custoMinino = (2 * n + 3);
        int custoMaximo = (3 * n + 3);
        System.out.println();
        System.out.println("N= " + n + ": " + custoMinino + " <= T(l) <= " + custoMaximo);
        System.out.println("Melhor caso: " + custoMinino + "\nPior caso: " + custoMaximo);
        System.out.println("Custo médio: " + (custoMaximo - custoMinino));
        
        return soma;
    }
}
