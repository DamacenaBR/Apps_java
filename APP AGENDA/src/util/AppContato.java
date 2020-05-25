/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.ContatoDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.sound.midi.Soundbank;
import modelo.Contato;

/**
 *
 * @author fafic
 */
public class AppContato {
    private ContatoDAO contatoDAO;
    
    public AppContato(){
        contatoDAO = new ContatoDAO();
        
    }
    
    private int menu(){
        System.out.println("=====Inicio Menu=====");
        System.out.println("1 - Para SALVAR contato");
        System.out.println("2 - Para ATUALIZAR contato");
        System.out.println("3 - Para DELETAR contato");
        System.out.println("4 - Para IMPRIMIR contatos");
        System.out.println("5 - Para SAIR");
        System.out.print("Digite a OPÇÃO: ");
    Scanner scanner = new Scanner (System.in);
    int opcao = scanner.nextInt();
    System.out.println("=====Final Menu=====");
    return opcao;
    }
    private void salvarContato(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade: ");
        Integer idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        
        Contato contato = new Contato(nome, idade, telefone);
        if (contatoDAO.salvarContato(contato)){
            System.out.println("Contato SALVO com sucesso.");
        } else{
            System.out.println("Contato NÃO FOI SALVO...");
        }
    }
    
    private void imprimirContatos(){
        List<Contato> contatos = contatoDAO.getContatos();
       for (int i = 0; i< contatos.size(); i++){
           System.out.println(contatos.get(i));
       }
    }
    
    public void executar(){
    while(true){
               int opcao = menu();
        
        if (opcao == 1){
            System.out.println("Campo de Salvar");
            salvarContato();
        }else if (opcao == 2){
            System.out.println("Campo de Atualizar");
        }else if (opcao == 3){
            System.out.println("Campo de Deletar");
        }else if (opcao == 4){
            System.out.println("Campo de Imprimir Contatos");
            imprimirContatos();
            }else if (opcao == 5){
                System.out.println("Saindo do APP...");
            break;
        }else {
            System.out.println("Opção INVÁLIDA.\n Escolha uma nova opção!");
        }
    }
    }
    public static void main(String[] args) {
        AppContato app = new AppContato();
        app.executar();
    }
    
    
}
