/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.Fila;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        
        System.out.println("Inserindo!");

        fila.inserir(8);
        fila.inserir(5);
        fila.inserir(14);
        fila.inserir(9);
        fila.inserir(9);
        
        System.out.println(fila.toString());
        
        System.out.println("\nRemovendo!");
        fila.remover();
        System.out.println(fila.toString());
        
    }
    
}
