/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.vetor.principal;

import br.com.fafic.vetor.classes.Vetor;

/**
 *
 * @author COMPUTER
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        
        vetor.insetirOtimizado(5);
        vetor.insetirOtimizado(23);
        vetor.insetirOtimizado(14);
        
        System.out.println(vetor.toString());
        System.out.println("Quantidade de Elementos: " + vetor.quantidadeDeElemento());
        vetor.imprimir();
        System.out.println(vetor.obterDeUmaPosicao(2));
        vetor.existe(14);
        vetor.inserirPorElemento(1, 15);
        System.out.println(vetor.toString());
        vetor.removerElemento(0);
        System.out.println(vetor.toString());
        System.out.println("Quantidade de Elementos: " + vetor.quantidadeDeElemento());
        
    }
    
    
}
