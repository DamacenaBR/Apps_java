/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.Classes;

/**
 *
 * @author COMPUTER
 */
public class Vetor {
   
    public void mediana(int[] vetor, int n){

        int mediana = vetor.length/2;
        int max = 0;
        int index = 0;
        
        for (int i = 0; i <= mediana; i++) {
            max = 0;
            for (int j = 0; j < vetor.length; j++) {
                if(vetor[j] > max){
                    max = vetor[j];
                    index = j;
                }
            }
            vetor[index] = -1;
        }
        System.out.printf("Mediana = %d%nPosição = %d%n", max, index);
        int custoMinino = (5 * n + 1);
        int custoMaximo = (7 * n - 1);
        System.out.println();
        System.out.println("N= " + n + ": " + custoMinino + " <= T(l) <= " + custoMaximo);
        System.out.println("Melhor caso: " + custoMinino + "\nPior caso: " + custoMaximo);
        System.out.println("Custo médio: " + (custoMaximo - custoMinino));
    }
    
    public void calcularCusto(int[] vetor){
        
        int c1 = 1, c2 = 1, c3 = 1, c4 = 0, c5 = 0, c6 = 0,
                c7 = 0, c8 = 0, c9 = 0, c10 = 0, c11 = 0;
        
        int mediana = vetor.length/2; //c1
        int max = 0; //c2
        int indice = 0; //c3
        
        c4+=1;
        for (int i = 0; i <= mediana; i++) {//c4 = N+1
            c4+=1;
            max = 0;//c5 = 1;
            c5+=1;
            c6+=1;
            for (int j = 0; j < vetor.length; j++) {//c6 = N
                c6+=1;
                c7+=1;
                if(vetor[j] > max){//c7 = N
                    max = vetor[j];//c8 = N ou 0
                    c8+=1;
                    indice = j;//c9 = N ou 0
                    c9+=1;
                }
            }
            vetor[indice] = -1;//c10 = 1
            c10+=1;
        }
        System.out.printf("Mediana = %d%nPosição = %d%n", max, indice); //c11 = 1
        c11+=1;
        System.out.println("Custo: "+(c1+c2+c3+c4+c5+c6+c7+c8+c9+c10+c11));
    }
}
