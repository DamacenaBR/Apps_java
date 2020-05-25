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
        Pilha p1 = new Pilha(5);
        
        p1.inserir(1);
        p1.inserir(2);
        p1.inserir(3);
        p1.inserir(4);
        p1.inserir(5);
        
        System.out.println(p1.toString());
        System.out.println("Topo da pilha: " + p1.topoPilha());
        System.out.println("Tamanho da pilha: " + p1.tamanhoPilha());
        System.out.println("Pilha vazia: " + p1.pilhaVazia());
        
        p1.remover();
        System.out.println();
        
        System.out.println(p1.toString());
        System.out.println("Topo da pilha: " + p1.topoPilha());
        System.out.println("Tamanho da pilha: " + p1.tamanhoPilha());
        System.out.println("Pilha vazia: " + p1.pilhaVazia());
        
        p1.remover();
        p1.remover();
        p1.remover();
        p1.remover();
        
        System.out.println();
        
        System.out.println(p1.toString());
        System.out.println("Topo da pilha: " + p1.topoPilha());
        System.out.println("Tamanho da pilha: " + p1.tamanhoPilha());
        System.out.println("Pilha vazia: " + p1.pilhaVazia());
    }    
}
