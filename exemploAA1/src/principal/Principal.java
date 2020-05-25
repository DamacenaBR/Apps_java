/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Classes.Vetor;
import java.util.Arrays;

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
        
        int vetor [] = {20,-30,15,-10,30,-20,-30,30};
        //int vetor [] = {11,56,89,45,78};
        
//        System.out.println("Maior valor: " + v.maiorValor(vetor));
//        System.out.println("Menor valor: " + v.menorValor(vetor));
//        System.out.println("vetor: " + Arrays.toString(vetor));
//        System.out.println("Valor do meio: " + v.valorMeio(vetor));
        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.println("Soma numeros positivos: " + v.calcSoma(vetor, vetor.length));
    }
    
}
