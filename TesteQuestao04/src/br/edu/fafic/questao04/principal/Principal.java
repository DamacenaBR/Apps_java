/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao04.principal;

import br.edu.fafic.questao04.classes.Aviao;
import br.edu.fafic.questao04.classes.Fila;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila fila = new Fila();
        
        Aviao A1 = new Aviao("Gol", "Branco", 123);
        Aviao A2 = new Aviao("Gol", "Amarelo", 456);
        Aviao A3 = new Aviao("Gol", "Azul", 789);
        Aviao A4 = new Aviao("Gol", "Vermelho", 146);
        
        System.out.println("Inserir avião lista de espera!");
        fila.adFilaEspera(A1);
        fila.adFilaEspera(A2);
        fila.adFilaEspera(A3);
        fila.adFilaEspera(A4);
        
        System.out.println();
        
        System.out.println("Listado Fila de espera!");
        System.out.println(fila.filaDecolagem());
        
        System.out.println();
        
        System.out.println("Autorizar decolagem!");
        fila.decolagem();
        System.out.println(fila.filaDecolagem());
        
        System.out.println();
        
        System.out.println("Total de avião lista de espera!");
        System.out.println("Total: " + fila.numAviaoFilaDecol());
        
        System.out.println();
        
        System.out.println("Primeiro avião lista de espera!");
        fila.primeiroAviao();
        
    }
    
}
