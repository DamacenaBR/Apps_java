/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.listaSimplismente.principal;

import br.edu.fafic.listaSimplismente.classes.Medico;
import br.edu.fafic.listaSimplismente.classes.Simplismente;

/**
 *
 * @author COMPUTER
 */
public class Principal {
    public static void main(String[] args) {
        Simplismente s1 = new Simplismente();
        
        s1.inserirFinal(1);
        s1.inserirFinal(2);
        s1.inserirFinal(3);
        s1.inserirFinal(2);
        s1.inserirFinal(5);
        s1.inserirFinal(2);
        s1.inserirFinal(7);
        s1.inserirFinal(2);
        s1.inserirFinal(9);
        s1.inserirFinal(2);
        s1.inserirFinal(2);
        s1.inserirFinal(2);
        s1.inserirFinal(2);
        s1.inserirFinal(2);
        
        System.out.println(s1.imprimir());
        
        s1.removerRepetidos(2);
        
        System.out.println(s1.imprimir());
        
        System.out.println();
        
//        Simplismente s2 = new Simplismente();
//        
//        s2.inserirFinal(1);
//        s2.inserirFinal(2);
//        s2.inserirFinal(3);
//        s2.inserirFinal(4);
//        s2.inserirFinal(5);
//        s2.inserirFinal(6);
//        s2.inserirFinal(7);
//        s2.inserirFinal(8);
//        s2.inserirFinal(9);
//        
//        System.out.println(s2.imprimir());
//        
//        s2.removerIndexImpar();
//        
//        System.out.println(s2.imprimir());
    }
}
