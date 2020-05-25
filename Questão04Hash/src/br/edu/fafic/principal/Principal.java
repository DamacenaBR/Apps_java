/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.principal;

import br.edu.fafic.classes.Hash;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hash h = new Hash();

        h.inserir(34);
        h.inserir(45);
        h.inserir(67);
        h.inserir(78);
        h.inserir(89);
        h.inserir(55);

        h.imprimir();

        }
    
}
