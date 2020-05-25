/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciovetores;

import java.util.Scanner;

/**
 *
 * @author COMPUTER
 */
public class VetoresQuestoesTres {
    public static void main(String[] args) {
        int [] idades = new int [8];
        int [] dobroIdade = new int [8];
        
        Scanner input = new Scanner (System.in);
        
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite uma idade: ");
            int idade = Integer.parseInt(input.nextLine());
            
            idades[i] = idade;
            int dobro = idade * 2;
            
            dobroIdade[i] = dobro;   
        }
                
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade[" + i +"]: " + idades[i]);
        }
        
        for (int i = 0; i < idades.length; i++) {
            System.out.println("drobro[" + i +"]: " + dobroIdade[i]);
        }
    }
}
