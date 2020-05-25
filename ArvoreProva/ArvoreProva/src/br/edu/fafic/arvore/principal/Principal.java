/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.arvore.principal;

import br.edu.fafic.arvore.classes.Arvore;

/**
 *
 * @author COMPUTER
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arvore a1 = new Arvore();
        
        a1.inserirValor(30);
        a1.inserirValor(28);
        a1.inserirValor(29);
        a1.inserirValor(27);
        a1.inserirValor(25);
        a1.inserirValor(39);
        a1.inserirValor(52);
        a1.inserirValor(48);
        a1.inserirValor(68);
        a1.inserirValor(64);
        
        System.out.println();
        
        System.out.println("Fator balanceamento completo!");
        System.out.println("Fator Balanceamento: " + a1.fatorBalanceamento(a1.returnNo(30)));
        System.out.println("Soma nos: " + a1.somaNos(a1.returnNo(28)));
        System.out.println("Altura no: " + a1.altura(a1.returnNo(27)));
        
        a1.imprimirPosOrdem(a1.returnRaiz());
        
        System.out.println("\n");
        
//        a1.removerNo(a1.returnRaiz(), 28);
//        
//        a1.imprimirPosOrdem(a1.returnRaiz());
        
        System.out.println();
        System.out.println("Soma folhas: " + a1.somadeFolhas(a1.returnRaiz()));
        System.out.println("Quantidade folhas: " + a1.quantFolhas(a1.returnRaiz()));
        
//        System.out.println();
//        
//        a1.imprimirPosOrdem(a1.returnRaiz());
//        
//        System.out.println();
//        
//        a1.removerNo(a1.returnRaiz(), 25);
//        
//        a1.imprimirEmOrdem(a1.returnRaiz());
//        
//        System.out.println("\n");
//        
//        System.out.println("O valor 25 removido!");
//        
//        System.out.println("Menor valor da arvore: " + a1.returnMenorValor(a1.returnRaiz()).getValor());
//        System.out.println("Maior valor da arvore: " + a1.returnMaiorValor(a1.returnRaiz()).getValor());
//        
//        System.out.println();
//        
//        System.out.println("Fator balanceamento com o 25 removido!");
//        System.out.println("Fator Balanceamento: " + a1.fatorBalanceamento(a1.returnNo(39)));
        
        
    }
    
}
