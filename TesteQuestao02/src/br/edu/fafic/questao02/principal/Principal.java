/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao02.principal;

import br.edu.fafic.questao02.classes.Aluno;
import br.edu.fafic.questao02.classes.Fila;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila fila = new Fila();
        
        Aluno A1 = new Aluno("Bruno", "C1", 123);
        Aluno A2 = new Aluno("Felipe", "C2", 456);
        Aluno A3 = new Aluno("Daniel", "C3", 789);
        Aluno A4 = new Aluno("Mayara", "C4", 258);
        
        
        System.out.println("Metodo inserir!");
        fila.inserir(A1);
        fila.inserir(A2);
        fila.inserir(A3);
        fila.inserir(A4);
        System.out.println(fila.string());
        
        System.out.println();
        
        System.out.println("Metodo remover!");
        fila.remover();
        System.out.println(fila.string());
        
        System.out.println();
        
        System.out.println("Buscar por matrícula!");
        System.out.println("Aluno: " + fila.buscarMatricula(789));
        
        System.out.println();
        
        System.out.println("Primeiro elemento!");
        System.out.println("Aluno: " + fila.elementoInicio().getAluno());
        
        System.out.println();
        
        System.out.println("Quantidades de alunos!");
        System.out.println("Quantidade: " + fila.quantAlunos());
    }   
}
