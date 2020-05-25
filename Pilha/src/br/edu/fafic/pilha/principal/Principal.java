/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.pilha.principal;

import br.edu.fafic.pilha.classes.Pilha;

/**
 *
 * @author danyllo
 */
public class Principal {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);
        pilha.inserirNaPilha(10);
        pilha.inserirNaPilha(6);
        pilha.inserirNaPilha(8);
        pilha.inserirNaPilha(5);
        pilha.inserirNaPilha(2);

        System.out.println("Pilha inicial: " + pilha.toString());
        System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
        System.out.println("Pilha está vazia? " + pilha.pilhaVazia());
        System.out.println("Topo da pilha: " + pilha.topoDaPilha());
        System.out.println("");

        pilha.remover();
        System.out.println("Pilha 1º remover: " + pilha.toString());
        System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
        System.out.println("Pilha está vazia? " + pilha.pilhaVazia());
        System.out.println("Topo da pilha: " + pilha.topoDaPilha());
        System.out.println("");

        pilha.remover();
        System.out.println("Pilha 2º remover: " + pilha.toString());
        System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
        System.out.println("Pilha está vazia? " + pilha.pilhaVazia());
        System.out.println("Topo da pilha: " + pilha.topoDaPilha());
        System.out.println("");
        

        System.out.println("Esvazear pilha");
        while (pilha.pilhaVazia() == false) {
            pilha.remover();

        }

        System.out.println("Pilha final: " + pilha.toString());
        System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
        System.out.println("Pilha está vazia? " + pilha.pilhaVazia());
        System.out.println("Topo da pilha: " + pilha.topoDaPilha());

    }

}
