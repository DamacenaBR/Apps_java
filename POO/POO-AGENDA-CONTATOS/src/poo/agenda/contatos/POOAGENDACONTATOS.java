/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.agenda.contatos;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Allyson
 */
public class POOAGENDACONTATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        String nome = "Allyson";
        String outroNome = "João";
        
        
        if(nome.startsWith("D")){
            System.out.println("OK");
        }
        else{
            System.out.println(":(");
        }
        
        if(nome.equals(outroNome)){
            System.out.println("São nomes iguais");
        }
        else{
            System.out.println("São nomes diferentes"); 
        }
        */

        Scanner input = new Scanner(System.in);
        
        String numero = input.nextLine();
        int x = Integer.parseInt(numero);
       
        Agenda a = new Agenda();
        
        Pessoa p = new Pessoa();
        
        System.out.println("Nome: ");
        p.nome = input.nextLine();
        System.out.println("E-mail:");
        p.email = input.nextLine();
        System.out.println("Telefone: ");
        p.cadastrarNumero(input.nextLine());

        a.cadastrarPessoa(p);
 
        Pessoa p2 = new Pessoa();
        
        System.out.println("Nome: ");
        p2.nome = input.nextLine();
        System.out.println("E-mail:");
        p2.email = input.nextLine();
        System.out.println("Telefone: ");
        p2.cadastrarNumero(input.nextLine());

        a.cadastrarPessoa(p2);
        
        a.listarPessoas();
 
        
    }
    
}
