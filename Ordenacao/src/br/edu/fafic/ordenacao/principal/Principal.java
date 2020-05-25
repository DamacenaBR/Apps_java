/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.ordenacao.principal;

import br.edu.fafic.ordenacao.classes.Ordenacao;
import java.util.Arrays;
import java.util.Scanner;

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
        
        System.out.println("Ordenação por Troca!!");
        System.out.println(Arrays.toString(vetor));
        ord.ordenacaoPorTroca(vetor);
        System.out.println(Arrays.toString(vetor));
        
        System.out.println();
        
        vetor[0] = 12;
        vetor[1] = 5;
        vetor[2] = 6;
        vetor[3] = 15;
        vetor[4] = 8;
        
        System.out.println("Ordenação por Seleção!!");
        System.out.println(Arrays.toString(vetor));
        ord.selectionSort(vetor);
        System.out.println(Arrays.toString(vetor));
        
        System.out.println();
        
        vetor[0] = 7;
        vetor[1] = 14;
        vetor[2] = 6;
        vetor[3] = 19;
        vetor[4] = 50;
        
        System.out.println("Ordenação por Inseção!!");
        System.out.println(Arrays.toString(vetor));
        ord.insertionSort(vetor);
        System.out.println(Arrays.toString(vetor));
        
        System.out.println();
        
        vetor[0] = 5;
        vetor[1] = 19;
        vetor[2] = 20;
        vetor[3] = 2;
        vetor[4] = 7;
        
        System.out.println("Ordenação por Bolha!!");
        System.out.println(Arrays.toString(vetor));
        ord.bubbleSort(vetor);
        System.out.println(Arrays.toString(vetor));
        
        System.out.println();
        
        vetor[0] = 2;
        vetor[1] = 18;
        vetor[2] = 5;
        vetor[3] = 10;
        vetor[4] = 7;
        
        System.out.println("Ordenação por Quick Sort!!");
        System.out.println(Arrays.toString(vetor));
        ord.quickSort(vetor,0,vetor.length - 1);
        System.out.println(Arrays.toString(vetor));
        
        System.out.println();
        
        vetor[0] = 10;
        vetor[1] = 11;
        vetor[2] = 5;
        vetor[3] = 2;
        vetor[4] = 7;
        
        System.out.println("Metodo de Busca Lenar!!");
        System.out.println(Arrays.toString(vetor));
        System.out.println("Índece: " + ord.buscaLinear(vetor, 10));
        
        /*System.out.println();
        
        System.out.println("Metodo de Busca Lenar2!!");
        Scanner input = new Scanner(System.in);      
        int valor = Integer.parseInt(input.nextLine());*/

        System.out.println();
        
        int [] vetor1 = new int [9];
        
        vetor1[0] = 2;
        vetor1[1] = 4;
        vetor1[2] = 5;
        vetor1[3] = 9;
        vetor1[4] = 12;
        vetor1[5] = 18;
        vetor1[6] = 25;
        vetor1[7] = 40;
        vetor1[8] = 60;
        
        System.out.println("Metodo de Pesquisa Binaria!!");
        System.out.println(Arrays.toString(vetor));
        System.out.println("Índece: " + ord.buscaBinaria(vetor1, 0, 8, 2));
    }
}
