/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.executar;

import br.edu.fescfafic.beans.Cliente;
import br.edu.fescfafic.dao.ClienteDAO;
import java.util.Scanner;

/**
 *
 * @author COMPUTER
 */
public class APP {

    private final ClienteDAO clientesDAO;
    
    public APP(){
        clientesDAO = new ClienteDAO();
    }
    
    private void inserirFinal(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("INSIRA O NOME: ");
        String nome = input.nextLine();
        System.out.print("INSIRA O CPF: ");
        String cpf = input.nextLine();
        System.out.print("INSIRA O ENDEREÇO: ");
        String endereco = input.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf, endereco);
        
        if (clientesDAO.getLista().contains(cliente)) {
            System.out.println("ERRO: CLIENTE JÁ CADASTRADO!");
        }else{
            clientesDAO.inserir(cliente);
            System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
        }
    }
    
    private void inserirIndex(){
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < clientesDAO.getLista().size(); i++) {
            System.out.println("INDEX [" + i + "], " + "NOME: " + clientesDAO.getLista().get(i).getNome());
        }
        
        System.out.print("INFORME O INDEX: ");
        int index = Integer.parseInt(input.nextLine());
        
        System.out.print("INSIRA O NOME: ");
        String nome = input.nextLine();
        System.out.print("INSIRA O CPF: ");
        String cpf = input.nextLine();
        System.out.print("INSIRA O ENDEREÇO: ");
        String endereco = input.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf, endereco);
        
        if (clientesDAO.getLista().contains(cliente)) {
            System.out.println("ERRO: CLIENTE JÁ CADASTRADO!");
        }else{
            clientesDAO.inserir(index, cliente);
            System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
        }
    }
    
    private void removerFinal(){
        if (clientesDAO.remover()) {
            System.out.println("CLIENTE REMOVIDO COM SUCESSO!");
        }
        System.out.println("ERRO: CLIENTE NÃO REMOVIDO!");
    }
    
    private void removerIndex(){
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < clientesDAO.getLista().size(); i++) {
            System.out.println("INDEX [" + i + "], " + "NOME: " + clientesDAO.getLista().get(i).getNome());
        }
        
        System.out.print("INFORME O INDEX: ");
        int index = Integer.parseInt(input.nextLine());
                
        if (clientesDAO.remover(index)) {
            System.out.println("CLIENTE REMOVIDO COM SUCESSO!");
        }
        System.out.println("ERRO: CLIENTE NÃO REMOVIDO!");
    }
    
    private void alterar(){
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < clientesDAO.getLista().size(); i++) {
            System.out.println("INDEX [" + i + "], " + "NOME: " + clientesDAO.getLista().get(i).getNome());
        }
        
        System.out.print("INFORME O INDEX: ");
        int index = Integer.parseInt(input.nextLine());
        
        System.out.print("INSIRA O NOME: ");
        String nome = input.nextLine();
        System.out.print("INSIRA O CPF: ");
        String cpf = input.nextLine();
        System.out.print("INSIRA O ENDEREÇO: ");
        String endereco = input.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf, endereco);
        
        if (clientesDAO.alterar(index, cliente)) {
            System.out.println("CLIENTE REMOVIDO COM SUCESSO!");
        }
        System.out.println("ERRO: CLIENTE NÃO REMOVIDO!");  
    }
    
    private void getLista(){
        if (!clientesDAO.getLista().isEmpty()) {
            for (int i = 0; i < clientesDAO.getLista().size(); i++) {
                System.out.println(clientesDAO.getLista().get(i));
            }
        } else {
            System.out.println("ERRO.: CADASTRO VAZIO !!!");
        }
    }
    
    private void getObjeto(){
        for (int i = 0; i < clientesDAO.getLista().size(); i++) {
            System.out.println("INDEX [" + i + "], " + "NOME: " + clientesDAO.getLista().get(i).getNome());
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nDIGITE O INDEX: ");
        int index = Integer.parseInt(input.nextLine());

        System.out.println(clientesDAO.getLista().get(index));
    }
    
    private int menuOpcao(){
        
        System.out.print("\n.........................................\n" +
                           "             CLIENTES" + 
                "\n+ [1] - INSERIR CLIENTE NO FINAL;" +
                "\n+ [2] - INSEIR CLINETE POR INDEX" +
                "\n+ [3] - REMOVER CLIENTE NO FINAL" +
                "\n+ [4] - REMOVER CLIENTE POR INDEX" +
                "\n+ [5] - ALTERAR DADOS DO CLIENTE" +
                "\n+ [6] - LISTAR TODOS OS CLIENTES" +
                "\n+ [7] - MOSTAR CLIENTE" +
                "\n+ [0] - SAIR" +
                "\n+ OPÇÃO: ");
                
        Scanner input = new Scanner(System.in);
        int opcao = Integer.parseInt(input.nextLine());
        return opcao;
   
    }
    
    public void executar(){
        boolean loop = true;
        
        do {
            
            int cont = menuOpcao();
            
            switch(cont){
                case 1:
                    inserirFinal();
                    break;
                case 2:
                    inserirIndex();
                    break;
                case 3:
                    removerFinal();
                    break;
                case 4:
                    removerIndex();
                    break;
                case 5:
                    alterar();
                    break;
                case 6:
                    getLista();
                    break;
                case 7:
                    getObjeto();
                    break;
                case 0:
                    System.out.println("\n.........................................\n" + 
                                       "             EXECUÇÃO FINALIZADA!!!");
                    loop = false;
                default:
                    System.out.println("\n.........................................\n" + 
                                       "             OPÇÃO INVALIDA!!!");
                    break;
            }
        } while (loop);
            
    }
    public static void main(String[] args) {
        APP app = new APP();
        app.executar();;
    }   
}
