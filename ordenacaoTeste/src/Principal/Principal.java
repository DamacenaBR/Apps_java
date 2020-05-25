/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Classes.Aluno;
import Classes.Ordenacao;
import Classes.Vetor;
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
        
//        int [] vetor = new int [5];
//        
//        vetor[0] = 90;
//        vetor[1] = 16;
//        vetor[2] = 81;
//        vetor[3] = 1;
//        vetor[4] = 23;
//        
//        
//        Ordenacao ord = new Ordenacao();
//      
//        System.out.println("Ordenação por troca");
//        System.out.println(Arrays.toString(vetor));
//        ord.ordenacaoPorTroca(vetor);
//        System.out.println(Arrays.toString(vetor)); 
//        
//        System.out.println();
//        
//        vetor[0] = 9;
//        vetor[1] = 12;
//        vetor[2] = 45;
//        vetor[3] = 6;
//        vetor[4] = 23;
//        
//        System.out.println("Ordenação por seleção");
//        System.out.println(Arrays.toString(vetor));
//        ord.selectionSort(vetor);
//        System.out.println(Arrays.toString(vetor));
//        
//        System.out.println();
//        
//        vetor[0] = 14;
//        vetor[1] = 12;
//        vetor[2] = 23;
//        vetor[3] = 54;
//        vetor[4] = 1;
//               
//        System.out.println("Ordenação por inserção");
//        System.out.println(Arrays.toString(vetor));
//        ord.bubbleSort(vetor);
//        System.out.println(Arrays.toString(vetor));
//        
//        System.out.println();
//        
//        vetor[0] = 62;
//        vetor[1] = 5;
//        vetor[2] = 29;
//        vetor[3] = 50;
//        vetor[4] = 8;
//               
//        System.out.println("Ordenação por bolha");
//        System.out.println(Arrays.toString(vetor));
//        ord.bubbleSort(vetor);
//        System.out.println(Arrays.toString(vetor));
//        
//        System.out.println();
//        
//        vetor[0] = 6;
//        vetor[1] = 2;
//        vetor[2] = 52;
//        vetor[3] = 14;
//        vetor[4] = 90;
//               
//        System.out.println("Ordenação por quickSort");
//        System.out.println(Arrays.toString(vetor));
//        ord.quickSort(vetor, 0,4);
//        System.out.println(Arrays.toString(vetor));
//        
//        System.out.println("Busca Binaria");
//        System.out.println(Arrays.toString(vetor));
//        System.out.println(ord.buscaBinaria(vetor, 0,4, 90));
//        
//        System.out.println("Fator balanceamento valor ");

        Aluno a1 = new Aluno("Bruno", 2);
        Aluno a2 = new Aluno("Felipe", 1);
        Aluno a3 = new Aluno("Daniel", 5);
        Aluno a4 = new Aluno("Gutembergue", 10);
        Aluno a5 = new Aluno("Danuelo", 8);
        
        Aluno [] aluno = new Aluno [5];
        

        aluno [0] = a1;
        aluno [1] = a2;
        aluno [2] = a3;
        aluno [3] = a4;
        aluno [4] = a5;
        
//        v1.inserir(a1);
//        v1.inserir(a2);
//        v1.inserir(a3);
//        v1.inserir(a4);
//        v1.inserir(a5);
        
        System.out.println(Arrays.toString(aluno));
        
        Ordenacao ord = new Ordenacao();
        
//        ord.orndençãoPorTroca(aluno);
//        
//        System.out.println(Arrays.toString(aluno));
        
        
        System.out.println("Ordenação por seleção");;
        ord.selectionSort(aluno);
        System.out.println(Arrays.toString(aluno));
    }
    
}
