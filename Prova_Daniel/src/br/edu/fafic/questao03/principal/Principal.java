/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao03.principal;

import br.edu.fafic.questao03.classes.ListaDuplamente;
import br.edu.fafic.questao03.classes.Medico;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDuplamente lista = new ListaDuplamente();
             
        Medico med1 = new Medico("Felipe",5123);
        Medico med2 = new Medico("Daniel",5846);
        Medico med3 = new Medico("Andreia",54512);
        Medico med4 = new Medico("Bruno",5245);

        lista.inserirInicio(med1);
        lista.inserirInicio(med2);
        lista.inserirFinal(med3);
        lista.inserirFinal(med4);
        
        System.out.println("Inserir Inicio");
        System.out.println(lista.imprimir());
        
        System.out.println();
        
        lista.buscarPorNome("Felipe");
        System.out.println(lista.imprimir());
        
        System.out.println();
        
        lista.buscarPorNome("Andreia");
        System.out.println(lista.imprimir());
        
        System.out.println();
        
        lista.buscarPorNome("Bruno");
        System.out.println(lista.imprimir());
    }
}
