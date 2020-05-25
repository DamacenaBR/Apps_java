/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.Classes.Vetor;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vetor v = new Vetor();        
        int [] vetor = {1,10,5,9,48,35,45,7,3,0}; 
        
        v.mediana(vetor, vetor.length);        
        System.out.println();
        
        v.calcularCusto(vetor);
        
    }   
    
}
