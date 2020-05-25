/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao01.principal;

import br.edu.fafic.questao01.classes.Pilha;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        System.out.println("Metodo empilhar!");
        pilha.empilhar(12);
        pilha.empilhar(8);
        pilha.empilhar(18);
        pilha.empilhar(10);
        System.out.println(pilha.string());
        System.out.println("Topo da pilha: " + pilha.topoPilha().getNumero());
        
        System.out.println();
        
        System.out.println("Metodo desempilhar");
        pilha.empilhar(5);
        System.out.println(pilha.string());
        System.out.println("Topo da pilha: " + pilha.topoPilha().getNumero());
    }
    
}
