/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dougals;

import classes.CustoRecursivo;
import classes.Fatorial;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustoRecursivo c = new CustoRecursivo();
        System.out.println("Res Multiplicação: " + c.multiplicacao(3, 5));
        System.out.println();
        System.out.println("Res Potenciação: " + c.potenciacao(2, 3));
    }
    
}
