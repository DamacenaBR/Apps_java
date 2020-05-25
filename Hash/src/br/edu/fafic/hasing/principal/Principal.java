/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.hasing.principal;

import br.edu.fafic.hasing.classes.Hashing;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hashing hashing = new Hashing();
        
        hashing.inserir(17);
        hashing.inserir(12);
        hashing.inserir(108);
        hashing.inserir(74);
        hashing.inserir(17);
        hashing.inserir(12);
        hashing.inserir(108);
        hashing.inserir(74);
        hashing.imprimir();
        
        System.out.println(hashing.buscar(17));
        
    }
    
}
