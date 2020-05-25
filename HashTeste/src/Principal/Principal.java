/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Classes.Hash;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hash h1 = new Hash();
        
        h1.inserir(1);
        h1.inserir(10);
        h1.inserir(12);
        h1.inserir(56);
        h1.inserir(18);
        h1.inserir(60);
        h1.inserir(120);
        h1.inserir(150);
        
        
        System.out.println(h1.toString());
       
    }
    
}
