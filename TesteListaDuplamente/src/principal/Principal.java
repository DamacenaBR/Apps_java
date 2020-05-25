/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.ListaDuplamente;

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
        
        L1.inserirInicio(1);
        L1.inserirInicio(2);
        L1.inserirInicio(3);
        L1.inserirUltimo(4);
        L1.inserirUltimo(5);
        L1.inserirUltimo(6);
        L1.inserirPosicao(3, 7);
        L1.inserirPosicao(4, 8);
        L1.inserirPosicao(5, 9);
        L1.inserirUltimo(10);
        L1.inserirUltimo(10);
        L1.inserirUltimo(10);
        L1.inserirUltimo(10);
        L1.inserirUltimo(10);
        
        
        System.out.println(L1.imprimir());
        
//        System.out.println();
//        
//        L1.removerInicio();
//        L1.removerUltimo();
//        L1.removerPosicao(3);
//        System.out.println(L1.imprimir());
//        
//        System.out.println();
        
        L1.removerRepetido(10);
        System.out.println(L1.imprimir());
//        
//        System.out.println();
//        
//        L1.removerIndexImpar();
//        System.out.println(L1.imprimir());
//        
//        System.out.println();
//        
//        L1.removerRepetido(10);
//        System.out.println(L1.imprimir());
    }
    
}
