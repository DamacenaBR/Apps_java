/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisãoPoo;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
                
        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();
        
        System.out.print("Informe seu cpf: ");
        String cpf = input.nextLine();
        
        System.out.print("Informe seu telefone: ");
        String telefone = input.nextLine();
        
        System.out.print("Informe sua idade: ");
        String i = input.nextLine();
        int idade =  Integer.parseInt(i);
                      
        System.out.print("Informe o rua: ");
        String rua = input.nextLine();
        
        System.out.print("Informe o bairro: ");
        String bairro = input.nextLine();
        
        System.out.print("Informe a cidade: ");
        String cidade = input.nextLine();
        
        System.out.print("Informe o estado: ");
        String estado = input.nextLine();

        System.out.print("Informe o numero: ");
        int numero = input.nextInt();
        
        Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);

        Cliente cliente = new Cliente(nome, cpf, idade, telefone, endereco);
        
        System.out.println(cliente);
         
    }
    
    
}
