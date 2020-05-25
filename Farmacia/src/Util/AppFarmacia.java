
package Util;

import Dao.ClienteDAO;
import Dao.ProdutosDAO;
import Modelos.Cliente;
import Modelos.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class AppFarmacia {
    private ClienteDAO clienteDAO;
    private ProdutosDAO produtoDAO;
    
    public AppFarmacia(){    
        clienteDAO = new ClienteDAO();
        produtoDAO = new ProdutosDAO();
    }
    
    private int menu() { 
        System.out.println("\n  |Início Menu| ");
        System.out.println("1 - Para Salvar ");
        System.out.println("2 - Para Atualizar ");
        System.out.println("3 - Para Deletar ");
        System.out.println("4 - Para Listar ");
        System.out.println("5 - Para Retornar Ao Menu Princiapal\n");

        System.out.print("Digite a OPÇÃO: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.println("\n");

        return opcao;
    }
   private void salvarCliente() { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        Integer idade = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, idade, telefone);

        if (clienteDAO.salvarCliente(cliente)) {
            System.out.println("Cliente Salvo. !!!");
        } else {
            System.out.println("Cliente Não Foi Salvo.");
        }
    }
    private void atualizarCliente(){
        ArrayList<Cliente> clientes = clienteDAO.getClientes();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Código: " + i + " <- " + clientes.get(i).getNome());
        }
        
        System.out.print("Escolha o Cliente pelo Código: ");

        Scanner scanner = new Scanner(System.in);

        Integer codigo = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite novo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite nova idade: ");
        Integer idade = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite novo telefone: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, idade, telefone);

        if(clienteDAO.atualizarCliente(codigo, cliente)){
            System.out.println("Cliente Atualizado Com Sucesso!!! \n");
        }else{
            System.out.println("Cliente Não Atualizado!!! ");
        }    
    }
    private void deletarCliente(){
        ArrayList<Cliente> clientes = clienteDAO.getClientes();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Código: " + i + " <- " + clientes.get(i).getNome());
        }
        System.out.print("Escolha o Cliente pelo Codigo: ");

        Scanner scanner = new Scanner(System.in);

        Integer codigo = Integer.parseInt(scanner.nextLine());
        if (clienteDAO.deleteCliente(codigo)){
            System.out.println("Cliente Deletado Com Sucesso!!! \n");
        }else{
            System.out.println("Cliente Não Deletado!!! ");
        }
    }
    private void imprimirClientes(){
        ArrayList<Cliente> clientes = clienteDAO.getClientes();
        for (int i = 0 ; i < clientes.size(); i++){
            System.out.println(clientes.get(i));
        }
    }
    
    public int MenuPrincipal(){        
        System.out.println("\n  |Início Menu|  ");
        System.out.println("1 - Para Menu Cliente");
        System.out.println("2 - Para Menu Produtos ");
        System.out.println("3 - Para Menu Estoque ");
        System.out.println("4 - Para SAIR \n");
        System.out.print("\nDigite a OPÇÃO: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Menu Clientes Escolhido... \n");
                MenuClientes();
                break;
            case 2:
                System.out.println("Menu Produtos Escolhido... \n");
                MenuProdutos();
                break;
            case 3:
                System.out.print("Menu Estoque Escolhido... \n");
                MenuEstoque();
                break;
            case 4:
                System.out.println("Saindo !!! \n");
                break;
            default:
                System.out.println("Opção Invalida...\n");
                MenuPrincipal();
                break;
        }
        return opcao;
    }    
    private void MenuEstoque(){ 
         OUTER:
        while (true) {
            int opcao = menu();
            switch (opcao) {
                case 1:
                    System.out.println("Salvando Produto...");
                    salvarProduto();
                    break;
                case 2:
                    System.out.println("Atualizando Produto...");
                    atualizarProduto();
                    break;
                case 3:
                    System.out.println("Deletando Produto...");
                    deletarProduto();
                    break;
                case 4:
                    System.out.println("Imprimindo Produtos...");
                    imprimirProdutos();
                    break;
                case 5:
                    System.out.println("Retornando Ao Menu Principal...");
                    MenuPrincipal();
                    break OUTER;
                default:
                    System.out.println("Opção INVALIDA. \n Escolha uma nova opção.");
                    break;
            }
        }
    }     
      
        
    private void MenuProdutos() {
         OUTER:
        while (true) {
            int opcao = menu();
            switch (opcao) {
                case 1:
                    System.out.println("Salvando Produto...");
                    salvarProduto();
                    break;
                case 2:
                    System.out.println("Atualizando Produto...");
                    atualizarProduto();
                    break;
                case 3:
                    System.out.println("Deletando Produto...");
                    deletarProduto();
                    break;
                case 4:
                    System.out.println("Imprimindo Produtos...");
                    imprimirProdutos();
                    break;
                case 5:
                    System.out.println("Retornando Ao Menu Principal...");
                    MenuPrincipal();
                    break OUTER;
                default:
                    System.out.println("Opção INVALIDA. \n Escolha uma nova opção.");
                    break;
            }
        }
    }     
    private void MenuClientes() { 
        OUTER:
        while (true) {
            int opcao = menu();
            switch (opcao) {
                case 1:
                    System.out.println("Salvando Cliente...");
                    salvarCliente();
                    break;
                case 2:
                    System.out.println("Atualizando Cliente...");
                    atualizarCliente();
                    break;
                case 3:
                    System.out.println("Deletando Cliente...");
                    deletarCliente();
                    break;
                case 4:
                    System.out.println("Imprimindo Clientes...");
                    imprimirClientes();
                    break;
                case 5:
                    System.out.println("Retornando Para Menu Principal");
                    MenuPrincipal();
                    break OUTER;
                default:
                    System.out.println("Opção INVALIDA. \n Escolha uma nova opção.");
                    break;
            }
        }

    }
    
    private void salvarProduto() { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a Preço: ");
        Float preco = Float.parseFloat(scanner.nextLine());

        System.out.print("Digite o Código De Barras: ");
        String codigoBarra = scanner.nextLine();

        Produto produto = new Produto(nome,preco,codigoBarra);
        
        if(produtoDAO.salvarProduto(produto)){
           System.out.println("Produto Salvo. !!! \n");
        }else {
           System.out.println("Produto Não Foi Salvo.");
        }
    }
    private void deletarProduto(){
        ArrayList<Produto> produtos = produtoDAO.getProdutos();
         
        for(int i = 0; i < produtos.size(); i++){
            System.out.println("Código " + i + " <- " + produtos.get(i).getNome());
        }
        System.out.println("Escolha o Produto Pelo Código"); 
         
        Scanner scanner = new Scanner(System.in);
         
        Integer codigo = Integer.parseInt(scanner.nextLine());
         
        if (produtoDAO.deletarProduto(codigo)){
            System.out.println("Produtos Deletado Com Sucesso!!! \n");
        }else{
            System.out.println("Produto Não Deletado!!! ");
        }                   
    }   
    private void atualizarProduto(){
        ArrayList<Produto> produtos = produtoDAO.getProdutos();
         
        for(int i = 0; i < produtos.size(); i ++){
            System.out.println("Código " + i + " <- " + produtos.get(i).getNome()); 
        } 
        System.out.print("Escolha o Produto Pelo Código: ");
        Scanner scanner = new Scanner(System.in);
         
        Integer codigo = Integer.parseInt(scanner.nextLine());
         
        System.out.print("Digite novo nome: ");
        String nome = scanner.nextLine();
  
        System.out.print("Digite o Novo Preço: ");
        Float preco = Float.parseFloat(scanner.nextLine());
         
        System.out.print("Digite o Novo código de Barras: ");
        String codigoBarras = scanner.nextLine(); 
            
        Produto produto = new Produto(nome, preco, codigoBarras);
          
        if(produtoDAO.atualizarProduto(codigo, produto)){
            System.out.println("Produto Atualizado Com Sucesso!!! \n");        
        }else{
            System.out.println("Produto Não Atualizado!!! ");
        }
    }
    private void imprimirProdutos(){
        ArrayList<Produto> produtos = produtoDAO.getProdutos();
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i));
        }     
    }          
}

    
    
    
    
    

