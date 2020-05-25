/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agendacontatos.app;

import com.agendacontatos.dao.ContatoDAO;
import com.agendacontatos.beans.Contato;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Elder Pereira
 */
public class AppAgenda {
    private ContatoDAO cadastroContato;

    public AppAgenda() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("++++ SISTEMA PARA AGENDA DE CONTATOS ++++");
        System.out.print("--->Digite o tamanho da agenda: ");
        int tamanho = entrada.nextInt();
        cadastroContato = new ContatoDAO(tamanho); 
    }    
    
    private int menuOpcao() {
        System.out.println("****** Menu Agenda ******");
        System.out.println("1 - Cadastrar no final do vetor");
        System.out.println("2 - Cadastrar em uma posição do vetor");
        System.out.println("3 - Remover no final do vetor");
        System.out.println("4 - Remover em uma posição do vetor");
        System.out.println("5 - Atualizar um contato");
        System.out.println("6 - Listar todos os contatos");
        System.out.println("7 - Listar todos os contatos ordenados pelo nome");
        System.out.println("8 - Sair da agenda");                
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma opção: ");
        int opcao = entrada.nextInt();
        return opcao;
    }   

    private void cadastroFinalDoVetor() {
        System.out.println("--->Você escolheu Cadastrar-"); 
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("-->Digite o nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("-->Digite o telefone: ");
        String telefone = entrada.nextLine();
        
        Contato contato = new Contato(nome, telefone);
        
        if(cadastroContato.create(contato)){
            System.out.println("-->Cadastro realizado com sucesso...");
        }else{
            System.out.println("Não foi possível cadastrar...");
        }
        
        System.out.println("--->Saindo do cadastro-"); 
    }
        
    private void deleteFinalDoVetor() {
        System.out.println("--->Você escolheu deleter-"); 
        cadastroContato.delete();
        System.out.println("--->Saindo do deleter-"); 
    }
       
    private void atualizarContato(){
        System.out.println("--->Você escolheu atualizar-"); 
               
        for(int i=0; i<cadastroContato.read().length && 
                cadastroContato.read()[i] != null; i++){
            System.out.println(i + " -> " + cadastroContato.read()[i].getNome());            
        }           
        
        Scanner entradaIndice = new Scanner(System.in);
        Scanner entradaNome = new Scanner(System.in);
        Scanner entradaTelefone = new Scanner(System.in);
        
        System.out.print("->Selecione um catato pelo indice: "); 
        int index = entradaIndice.nextInt();
       
        System.out.print("->Novo nome: "); 
        String nome = entradaNome.nextLine();
       
        System.out.print("->Novo telefone: "); 
        String telefone = entradaTelefone.nextLine();        
        
       if(cadastroContato.updade(index, new Contato(nome, telefone))){
            for(int i=0; i<cadastroContato.read().length && 
                cadastroContato.read()[i] != null; i++){
                System.out.println(i + " -> " + cadastroContato.read()[i].getNome());            
            }  
       }else{
           System.out.println("Não foi possível atualizar...");
       }
                        
        System.out.println("Saindo da atualização...");
    }
    
    private void deleteMeioDoVetor(){
        System.out.println("--->Você escolheu remover no meio do vetor-"); 
               
        for(int i=0; i<cadastroContato.read().length && 
                cadastroContato.read()[i] != null; i++){
            System.out.println(i + " -> " + cadastroContato.read()[i].getNome());            
        }           
        
        Scanner entradaIndice = new Scanner(System.in);
               
        System.out.print("->Selecione um catato pelo indice: "); 
        int index = entradaIndice.nextInt(); 
            
        
        if(cadastroContato.delete(index)){
             for(int i=0; i<cadastroContato.read().length && 
                 cadastroContato.read()[i] != null; i++){
                 System.out.println(i + " -> " + cadastroContato.read()[i].getNome());            
             }  
        }else{
            System.out.println("Não foi possível deletar...");
        }
        
        System.out.println("Saindo da atualização...");
    }
    
    private void cadastroMeioDoVetor(){
        System.out.println("--->Você escolheu cadastrar no meio do vetor-"); 
               
        for(int i=0; i<cadastroContato.read().length && 
                cadastroContato.read()[i] != null; i++){
            System.out.println("Index --> "+i);            
        }           
        
        Scanner entradaIndice = new Scanner(System.in);
        Scanner entradaNome = new Scanner(System.in);
        Scanner entradaTelefone = new Scanner(System.in);
        
        System.out.print("->Selecione um index: "); 
        int index = entradaIndice.nextInt();
       
        System.out.print("->Novo nome: "); 
        String nome = entradaNome.nextLine();
       
        System.out.print("->Novo telefone: "); 
        String telefone = entradaTelefone.nextLine();        
        
       if(cadastroContato.create(index, new Contato(nome, telefone))){
            for(int i=0; i<cadastroContato.read().length && 
                cadastroContato.read()[i] != null; i++){
                System.out.println(i + " -> " + cadastroContato.read()[i].getNome());            
            }  
       }else{
           System.out.println("Não foi possível fazer o cadastro...");
       }
                        
        System.out.println("Saindo do cadastro...");
    }
        
    private void listaContatos(boolean ordem){    
        
        Contato contatos[] = new Contato[cadastroContato.getQuantidade()];
        
        for(int i=0; i<cadastroContato.read().length && 
                cadastroContato.read()[i] != null; i++){
            contatos[i] = cadastroContato.read()[i];
        }     
        
        if(ordem){
            System.out.println("--->Você escolheu listar contatos ordenadamente-");
            Arrays.sort(contatos);
        }else{
            System.out.println("--->Você escolheu listar contatos-");
        }
        
        for(int i=0; i<contatos.length; i++){
            System.out.println("--> ["+i+"]");
            System.out.println(contatos[i]);
        }     
        System.out.println("--->Saindo do listar-");
    } 
          
    public void execute(){        
        
        boolean condicao = true;
        
        while(condicao){
            int opcao = menuOpcao();
            if(opcao == 1){
                cadastroFinalDoVetor();
            }else if(opcao == 2){
                cadastroMeioDoVetor();
            }else if(opcao == 3){
                deleteFinalDoVetor();
            }else if(opcao == 4){
                deleteMeioDoVetor();
            }else if(opcao == 5){
                atualizarContato();
            }else if(opcao == 6){
                listaContatos(false);
            }else if(opcao == 7){
                listaContatos(true);
            }else if(opcao == 8){
                System.out.println("--->Você escolheu sair do programa.");
                System.out.println("--->Saindo...");
                condicao = false;
            }else{
                System.out.println("--->Essa opção não existe na AGENDA.");
            }    
        }
    }
    
    public static void main(String[]args){
        AppAgenda app = new AppAgenda();
        app.execute();
    }
}
