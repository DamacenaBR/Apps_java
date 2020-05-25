/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao03.principal;

import br.edu.fafic.questao03.classes.ListaDuplamente;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDuplamente L1 = new ListaDuplamente();        
        ListaDuplamente L2 = new ListaDuplamente();
        ListaDuplamente L3 = new ListaDuplamente();
        
        L1.inserir(11);
        L1.inserir(7);
        L1.inserir(1);
        L1.inserir(23);
        L1.inserir(29);
        
        System.out.println(L1.imprimir());
        
        L2.listaMult(L1, L2);
        
        System.out.println(L2.imprimir());
        
        L3.duplicarLista(L1, L2, L3);
        System.out.println(L3.imprimir());
    }
    
}
