/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.matrix.principal;


/**
 *
 * @author COMPUTER
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [][] alunos = new double [3][4];
        
        alunos[0][0] = 7;
        alunos[0][1] = 10;
        alunos[0][2] = 6;
        alunos[0][3] = 5;
        
        alunos[1][0] = 7;
        alunos[1][1] = 8;
        alunos[1][2] = 7;
        alunos[1][3] = 6;
        
        alunos[2][0] = 8;
        alunos[2][1] = 9;
        alunos[2][2] = 7;
        alunos[2][3] = 2;
               
        for (int i = 0; i < alunos.length; i++) {
            double maiorNota = 0;
            double somaNota = 0;
            double menorNota = 0;
            for (int j = 0; j < alunos[i].length; j++) {
                somaNota += alunos[i][j];
                
                menorNota = alunos[i][j];
                if (alunos[i][j] > maiorNota) {
                    maiorNota = alunos[i][j];
                }
                
                menorNota = alunos[i][j];
                if (alunos[i][j] < menorNota) {
                    menorNota = alunos[i][j];
                }
            }
            
            double media = somaNota / alunos[i].length;
            System.out.println("\nMedia do Aluno " + (i + 1) + ": " + media);
            System.out.println("Maior nota do Aluno " + (i + 1) + ": " + maiorNota);
            System.out.println("Menor Nota do Aluno " + (i + 1) + ": " + menorNota + "\n");
        }
   
    }    
    
    
    
}
