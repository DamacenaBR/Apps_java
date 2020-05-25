/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.listamenteencadeada.principal;

import br.edu.listamenteencadeada.classes.ListaSimplesmenteEncadeada;
import br.edu.listamenteencadeada.classes.Medico;

/**
 *
 * @author COMPUTER
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
             
        Medico med1 = new Medico("Felipe","Faz de tudo",5123);
        Medico med2 = new Medico("Daniel","Faz Quase Nada",5846);
        Medico med3 = new Medico("Andreia"," Faz Alguma Coisa",54512);
        Medico med4 = new Medico("Bruno","Faz Nada",5245);
               
        lista.inserirFim(med1);
        lista.inserirFim(med2);
        lista.inserirFim(med3);
        lista.inserirFim(med4);
        
        System.out.println(lista.imprimir());
        
        System.out.println(lista.buscar(2).getMedico());
        
        Medico med5 = new Medico("Amanda","Faz tudo",545);
        
        lista.inserirPosicao(1, med5);
        System.out.println(lista.imprimir());
        
        lista.removerInicio();
        System.out.println(lista.imprimir());
        
        lista.removerFinal();
        System.out.println(lista.imprimir());
        
        lista.removerPosicao(1);
        System.out.println(lista.imprimir());
    }
    
}
