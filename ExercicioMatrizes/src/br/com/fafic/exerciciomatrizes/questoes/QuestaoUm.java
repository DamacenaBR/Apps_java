/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.exerciciomatrizes.questoes;

/**
 *
 * @author gutemberg
 */
public class QuestaoUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] notas = new double[3][4];
        
        //Notas do primeiro aluno
        notas[0][0] = 10;
        notas[0][1] = 10;
        notas[0][2] = 10;
        notas[0][3] = 9;
        
        //Notas do segundo aluno
        notas[1][0] = 5;
        notas[1][1] = 9;
        notas[1][2] = 9;
        notas[1][3] = 9;
        
        //Notas do terceiro aluno
        notas[2][0] = 3;
        notas[2][1] = 6;
        notas[2][2] = 7;
        notas[2][3] = 1;
        
        double media = 0.0;
        double resultado = 0.0;
        
        double maiorNota = 10;
        double menorNota = 10;
        
        for(int i = 0; i < notas.length; i++){
            
            System.out.print("Média do Aluno " + (i + 1) + ": ");
            
            for(int j = 0; j < notas[i].length; j++){
                media += notas[i][j];
                
                if(notas[i][j] < menorNota){
                    menorNota = notas[i][j];
                }
                
                if(notas[i][j] > menorNota){
                    maiorNota = notas[i][j];
                }
                
            }
            
            resultado = media / notas[i].length;
            
            System.out.println(resultado);
            
            System.out.println(
                    "Menor nota do aluno " + (i + 1) + " é: " + menorNota);
            System.out.println(
                    "Maior nota do aluno " + (i + 1) + " é: " + maiorNota);
            
            resultado = 0;
            media = 0;
            
            System.out.println();
        }
    }
    
}
