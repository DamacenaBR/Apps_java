/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.listamenteduplamenteencadeada.principal;

import br.edu.listamenteduplamenteencadeada.classes.ListaDuplamenteEncadeada;
import br.edu.listamenteduplamenteencadeada.classes.Medico;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
             
        Medico med1 = new Medico("Felipe","Faz de tudo",5123);
        Medico med2 = new Medico("Daniel","Faz Quase Nada",5846);
        Medico med3 = new Medico("Andreia"," Faz Alguma Coisa",54512);
        Medico med4 = new Medico("Bruno","Faz Nada",5245);

        lista.inserirInicio(med1);
        lista.inserirInicio(med2);
        lista.inserirFinal(med3);
        
        System.out.println("Inserir Inicio");
        System.out.println(lista.imprimir());
        
        System.out.println();
        
        lista.inserirFinal(med4);
        System.out.println("Inserir Final");
        System.out.println(lista.imprimir());
        
        System.out.println();
        
        Medico med5 = new Medico("Gugu","Faz Nada",525);
        lista.inserirPosicao(1, med5);
        System.out.println("Inserir Por Posição");
        System.out.println(lista.imprimir());
        
        System.out.println();
        
        lista.removerInicio();
        System.out.println("Remover Inicio");
        System.out.println(lista.imprimir());        
        
        System.out.println();
        
        lista.removerFinal();
        System.out.println("Remover Final");
        System.out.println(lista.imprimir());
        
        System.out.println();
        
        lista.removerPosicao(2);
        System.out.println("Remover Posicao");
        System.out.println(lista.imprimir());
    }    
}
