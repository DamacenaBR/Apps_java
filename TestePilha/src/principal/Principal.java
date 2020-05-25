/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
        
        pilha.inserir(5);
        pilha.inserir(6);
        pilha.inserir(8);
        pilha.inserir(5); 
        System.out.println(pilha.toString());
        
        System.out.println("Topo da pilha: " + pilha.topoPilha());
        System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
        System.out.println("Pilha vazia: " + pilha.pilhaVazia());
        
        System.out.println();
        System.out.println("opção remover!");
        pilha.remover();
        System.out.println(pilha.toString());
        
        System.out.println("Topo da pilha: " + pilha.topoPilha());
        System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
        System.out.println("Pilha vazia: " + pilha.pilhaVazia());
       
    }
    
}
