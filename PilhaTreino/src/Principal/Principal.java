/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Classes.Pilha;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        
        System.out.println("Pilha vazia: " + pilha.pilhaVazia());
        
        System.out.println("\nMetodo inserir! ");
        pilha.inserir(9);
        pilha.inserir(6);
        pilha.inserir(1);
        pilha.inserir(16);
        System.out.println(pilha.toString());
        
        System.out.println("\nPilha vazia: " + pilha.pilhaVazia());
        System.out.println("\nTamanho da pilha: " + pilha.tamanhoPilha());
        System.out.println("\nMetodo topo da pilha: " + pilha.topoDaPilha());
        
        System.out.println("\nMetodo remover! ");
        pilha.remover();
        System.out.println(pilha.toString());
        
    }
    
}
