/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.matrix.principal;

import br.com.fafic.matrix.classes.Matriz;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz m = new Matriz();
        
        m.prencherMatriz();
        m.imprimirMatriz();
        
        System.out.println();
        
        m.prencherMatriz3D();
        m.imprimirMatriz3D();
    }
    
}
