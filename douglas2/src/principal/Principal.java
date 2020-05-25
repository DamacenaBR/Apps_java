/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classe.Soma;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = {7,12,8,4,10};        
        Soma s = new Soma();
        System.out.println("Soma: " + s.soma(a, 0, 4));
        
    }
    
}
