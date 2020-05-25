/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.fila.principal;

import br.edu.fafic.fila.classes.Fila;

/**
 *
 * @author danyllo
 */
public class Principal {

    public static void main(String[] args) {
        Fila f = new Fila();
        
        f.inserir(f, 10);
        f.inserir(f, 8);
        f.inserir(f, 23);
        f.inserir(f, 56);
        
        
        System.out.println(f.vazia(f));
        f.imprimir(f);
        f.remover(f);
        f.imprimir(f);
        
    }

}
