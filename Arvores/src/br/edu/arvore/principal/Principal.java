/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.arvore.principal;

import br.edu.arvore.classes.Arvore;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        arvore.inserirValor(35);
        arvore.inserirValor(27);
        arvore.inserirValor(21);
        arvore.inserirValor(23);
        arvore.inserirValor(30);
        arvore.inserirValor(29);
        arvore.inserirValor(28);
        arvore.inserirValor(32);
        arvore.inserirValor(60);
        arvore.inserirValor(40);
        arvore.inserirValor(71);
        arvore.inserirValor(65);
        arvore.inserirValor(63);
        arvore.inserirValor(61);
        arvore.inserirValor(64);
        
        System.out.println();
        
        System.out.println("busca No: " + arvore.returnNo(28).getValor());
        
        System.out.println();
       
        arvore.imprimirFolhas(arvore.returnRaiz());
        
        System.out.println();
        
        System.out.println("retornar pai 1");
        arvore.retornaPai(arvore.returnRaiz(), 40);
        
        System.out.println();
        
        System.out.println("retornar pai 2");
        System.out.println("O pai é " + arvore.retonarPai2(arvore.returnRaiz(), 40).getValor());
        
        System.out.println();
        
        System.out.println("retornar Nivel No 30");
        System.out.println(arvore.retornaNivelNo(arvore.returnRaiz(),30));
        
        System.out.println();
        
        System.out.println("retornar Nivel No 2 65");
        System.out.println(arvore.retornaNivelNo(arvore.returnRaiz(),65));  
        
        System.out.println();
        
        System.out.println("retornar filhos 35");
        arvore.retorneFilhos(arvore.returnRaiz(), 71);
        
        System.out.println();
        
        System.out.println("imprimir em ordem");
        arvore.imprimirEmOrdem(arvore.returnRaiz());
        
        System.out.println("\nimprimir por ordem");
        arvore.imprimirPorOrdem(arvore.returnRaiz());
        
        System.out.println("\nimprimir pos ordem");
        arvore.imprimirPosOrdem(arvore.returnRaiz());
        
        System.out.println();
        
        System.out.println("remover em no 30");
        arvore.removerNo(arvore.returnRaiz(),30);
        arvore.imprimirEmOrdem(arvore.returnRaiz());
        
        System.out.println();
        
        System.out.println("retornar filhos 29");
        arvore.retorneFilhos(arvore.returnRaiz(), 29);       
        
        System.out.println();       
        
        arvore.imprimirEmOrdem(arvore.returnRaiz());
        
        arvore.removerNo(arvore.returnRaiz(), 60);
        
        System.out.println();       
        
        arvore.imprimirEmOrdem(arvore.returnRaiz());

    }
}
