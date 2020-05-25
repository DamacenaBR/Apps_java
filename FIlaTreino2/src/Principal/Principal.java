/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Classes.Fila;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila f1 = new Fila(5);
        
        f1.inserir(1);
        f1.inserir(2);
        f1.inserir(3);
        f1.inserir(4);
        f1.inserir(5);
        
        System.out.println(f1.toString());
        
        System.out.println();
        
        System.out.println("Fila vazia: " + f1.filaVazia());
        f1.remover();
        
        System.out.println(f1.toString());
        
        
    }
    
}
