/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.encapsulamento;

import java.util.Scanner;

/**
 *
 * @author Allyson
 */
public class AgendaEncapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Agenda a = new Agenda();
        Contato c = null;
        Scanner input = new Scanner(System.in);
        String op = "";

        do {

            System.out.println("----MENU----");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - BUSCAR");
            System.out.println("3 - LISTAR");
            System.out.println("4 - EXCLUIR");
            System.out.println("0 - SAIR");

            op = input.nextLine();

            if (op.equals("1")) {
                c = new Contato();
                System.out.println("----CADASTRO----");
                System.out.println("Nome: ");
                String nome = input.nextLine();
                c.setNome(nome);

                System.out.println("E-mail: ");
                String email = input.nextLine();
                c.setEmail(email);

                System.out.println("Telefone: ");
                String telefone = input.nextLine();
                c.setTelefone(telefone);

                a.addContato(c);

                System.out.println("REGISTRO SALVO COM SUCESSO!");
            
            }            
            else if (op.equals("2")) {
                System.out.println("----BUSCA----");
                System.out.println("Buscar:");
                String busca = input.nextLine();
                a.buscarContatos(busca);
            
            }
            
            else if (op.equals("3")) {
                System.out.println("----LISTAR----");
                a.mostrarContatos();
            
            }            
            else if(op.equals("4")){
                System.out.println("----EXCLUIR----");
                System.out.println("Informe o e-mail: ");
                String email = input.nextLine();
                a.excluir(email);
                System.out.println("REGISTRO EXCLUÍDO COM SUCESSO!");
            
            }            
            else if (op.equals("0")) {
                System.out.println("SAINDO...");
            }

        } while (!op.equals("0"));

    }

}
