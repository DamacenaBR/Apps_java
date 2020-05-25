/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciovetores;

import java.util.Scanner;

/**
 *
 * @author Gutemberg
 */
public class VetoresQuestaoDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cidades = new String[5];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < cidades.length; i++){
            System.out.print("Informe a cidade: ");
            String nomeCidade = input.nextLine();
            
            cidades[i] =  nomeCidade;
        }
        
        System.out.println("Tamanho do array: " + cidades.length);
        
        System.out.println("Cidades de índice ímpar: ");        
        for(int i = 0; i < cidades.length; i++){
            if(i % 2 != 0){
                System.out.println("Cidade[" + i +"]: " + cidades[i]);
            }
        }
    }
    
}
