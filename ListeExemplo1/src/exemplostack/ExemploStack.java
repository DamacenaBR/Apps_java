/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostack;

import java.util.Stack;

/**
 *
 * @author COMPUTER
 */
public class ExemploStack {
        public static void main(String[] args) {
            Stack<String> pilha = new Stack<>();
            pilha.push("Livro 1");
            pilha.push("Livro 2");
            pilha.push("Livro 3");
            pilha.push("Livro 4");
            
            System.out.println(pilha);
            
            System.out.println("Topo: " + pilha.peek());
            pilha.pop();
            System.out.println("Topo: " + pilha.peek());
            pilha.pop();
            pilha.pop();
            System.out.println("Topo: " + pilha.peek());
            
            
        }
}
