/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.executar;

import br.edu.fescfafic.beans.Cliente;
import br.edu.fescfafic.beans.Emprestimos;
import br.edu.fescfafic.beans.Endereco;
import br.edu.fescfafic.dao.ClienteDAO;
import br.edu.fescfafic.exportacao.CpfInvalidoException;
import br.edu.fescfafic.exportacao.EnderecoInvalidoException;
import br.edu.fescfafic.exportacao.NomeInvalidoException;
import br.edu.fescfafic.exportacao.RuaInvalidoException;
import br.edu.fescfafic.exportacao.TelefoneInvalidoException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class APP {

    private final ClienteDAO clientesDAO;

    public APP() {
        this.clientesDAO = new ClienteDAO(); 
    }
 
    // COMEÇO METODOS CLIENTES

    private void inserirClienteFinal() throws NomeInvalidoException, EnderecoInvalidoException, CpfInvalidoException, RuaInvalidoException{
            
        try {
        
        System.out.println("..........................................");
        System.out.println("     OPÇÃO INSERIR CLIENTE NO FINAL\n");
        Scanner input = new Scanner(System.in);
        
        System.out.print("INFORME O SEU NOME: ");
        String nome = input.nextLine();
        System.out.print("INFORME O SEU CPF: ");
        String cpf = input.nextLine();
        System.out.print("INFORME O NUMERO CELULAR: ");
        String telefone = input.nextLine();

        System.out.print("INFORME A RUA: ");
        String rua = input.nextLine();
        System.out.print("INFORME O BAIRRO: ");
        String bairro = input.nextLine();
        System.out.print("INFORME O NUMERO: ");
        int numero = Integer.parseInt(input.nextLine());
        System.out.print("INFORME A CIDADE: ");
        String cidade = input.nextLine();
        System.out.print("INFORME O ESTADO: ");
        String estado = input.nextLine();
        
        float emprestimo = 0;
        float divida = 0;

        Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
        Emprestimos emprestimos = new Emprestimos(emprestimo, divida);
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimos);

        if (clientesDAO.getClientes().contains(cliente)) {
            System.out.println("..........................................");
            System.out.println("     ERRO.: CLIENTE JÁ CADASTRADO!!!");
            System.out.println("..........................................\n");      
        } else {
            clientesDAO.inserirCliente(cliente);
            mensCadastrar();
        }
        }catch(NomeInvalidoException e){ 
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }catch(TelefoneInvalidoException e){
            System.out.println(e.getMessage());
        }catch(RuaInvalidoException e){
            System.out.println(e.getMessage());
        }catch(EnderecoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    private void inserirClienteIndex() throws NomeInvalidoException, EnderecoInvalidoException, CpfInvalidoException, TelefoneInvalidoException, RuaInvalidoException {
        
        try {
        System.out.println("..........................................");
        System.out.println("    OPÇÃO INSERIR CLIENETE POR INDEX\n");
            
            if (!clientesDAO.getClientes().isEmpty()) {
                for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                    String cpf = clientesDAO.getClientes().get(i).getCpf();
                    System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                            + ", CPF: " + imprimeCPF(cpf));
                }

                Scanner input = new Scanner(System.in);

                System.out.println("..........................................");
                System.out.print("DIGITE O INDEX: ");
                int index = Integer.parseInt(input.nextLine());

                if (index > -1 && index < clientesDAO.getClientes().size()) {
                    

                    System.out.print("\nINFORME O SEU NOME: ");
                    String nome = input.nextLine();
                    System.out.print("INFORME O SEU CPF: ");
                    String cpf = input.nextLine();
                    System.out.print("INFORME O NUMERO CELULAR: ");
                    String telefone = input.nextLine();

                    System.out.print("INFORME A RUA: ");
                    String rua = input.nextLine();
                    System.out.print("INFORME O BAIRRO: ");
                    String bairro = input.nextLine();
                    System.out.print("INFORME O NUMERO: ");
                    int numero = Integer.parseInt(input.nextLine());
                    System.out.print("INFORME A CIDADE: ");
                    String cidade = input.nextLine();
                    System.out.print("INFORME O ESTADO: ");
                    String estado = input.nextLine();

                    float emprestimo = 0;
                    float divida = 0;

                    Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                    Emprestimos emprestimos = new Emprestimos(emprestimo, divida);
                    Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimos);

                    if (clientesDAO.getClientes().contains(cliente)) {
                        System.out.println("..........................................");
                        System.out.println("      ERRO.: CLIENTE JÁ CADASTRADO!!!");
                        System.out.println("..........................................\n");              
                    }else {
                        clientesDAO.inserirClienteIndex(index, cliente);
                        mensCadastrar();
                    }
                }else {
                    mensIndexInvalido();
                }

        }else {
            System.out.println("..........................................");
            System.out.println("         ERRO.: CADASTRO VAZIO!!!");
            System.out.println("OBS: ULTILIZE A OPÇÃO 1 PARA CADASTRAR!!!");
            System.out.println("..........................................\n");     
        }
        }catch(NomeInvalidoException e){ 
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }catch(TelefoneInvalidoException e){
            System.out.println(e.getMessage());
        }catch(RuaInvalidoException e){
            System.out.println(e.getMessage());
        }catch(EnderecoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void removerClienteFinal() {
        System.out.println("..........................................");
        System.out.println("          OPÇÃO REMOVER CLIENTE\n");
        
        if (!clientesDAO.getClientes().isEmpty()) {
            
            int cont = clientesDAO.getClientes().size() - 1;
            
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                boolean contagem = true;
                if (clientesDAO.getClientes().get(cont).getEmprestimos().getDivida() >= 1000) { 
                    System.out.println("...............................................");
                    System.out.println("      IMPOSSIVEL REMOVER O CLIENTE!!!");
                    System.out.println("ERRO.: CLIENTE TEM UM EMPRESTIMO A SER PAGO!!!");
                    System.out.println("...............................................\n");
                    contagem = false;
                    break;
                }

                if (contagem) {
                    clientesDAO.removerCliente();
                    mensRemover();
                    break;
                }
                } 
        }         
        else {
            mensCadastroVazio();
        }    
    }

    private void removerClienteIndex() {
        try{
            
        System.out.println("..........................................");
        System.out.println("   OPÇÃO REMOVER CLIENTE POR INDEX\n");
        
        if (!clientesDAO.getClientes().isEmpty()) {
            
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                String cpf = clientesDAO.getClientes().get(i).getCpf();
                System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                        + ", CPF: " + imprimeCPF(cpf));
            }

            Scanner input = new Scanner(System.in);

            System.out.println("..........................................");
            System.out.print("DIGITE O INDEX: ");
            int index = Integer.parseInt(input.nextLine());

            if (index > -1 && index < clientesDAO.getClientes().size()) {
                
                for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                    boolean contagem = true;
                    if (clientesDAO.getClientes().get(index).getEmprestimos().getDivida() >= 1000) { 
                        System.out.println("...............................................");
                        System.out.println("      IMPOSSIVEL REMOVER O CLIENTE!!!");
                        System.out.println("ERRO.: CLIENTE TEM UM EMPRESTIMO A SER PAGO!!!");
                        System.out.println("...............................................\n");
                        contagem = false;
                        break;
                    }

                    if (contagem) {
                        clientesDAO.removerClienteIndex(index);
                        mensRemover();
                        break;
                    }
                }  
            }else {
                mensIndexInvalido();
            }
            
        } else {
            mensCadastroVazio();
        }
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }
    }

    private void alterarClienteIndex() throws NomeInvalidoException, EnderecoInvalidoException, CpfInvalidoException, TelefoneInvalidoException, RuaInvalidoException {
        try{
            
        System.out.println("..........................................");
        System.out.println("      OPÇÃO ALTERAR CLIENTE POR INDEX\n");
                      
        if (!clientesDAO.getClientes().isEmpty()) {
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                String cpf = clientesDAO.getClientes().get(i).getCpf();
                System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                        + ", CPF: " + imprimeCPF(cpf));
            }

            Scanner input = new Scanner(System.in);
            
            System.out.println("..........................................");
            System.out.print("DIGITE O INDEX: ");
            int index = Integer.parseInt(input.nextLine());

            if (index > -1 && index < clientesDAO.getClientes().size()) {
                
                System.out.print("\nINFORME O SEU NOME: ");
                String nome = input.nextLine();
                System.out.print("INFORME O SEU CPF: ");
                String cpf = input.nextLine();
                System.out.print("INFORME O NUMERO CELULAR: ");
                String telefone = input.nextLine();

                System.out.print("INFORME A RUA: ");
                String rua = input.nextLine();
                System.out.print("INFORME O BAIRRO: ");
                String bairro = input.nextLine();
                System.out.print("INFORME O NUMERO: ");
                int numero = Integer.parseInt(input.nextLine());
                System.out.print("INFORME A CIDADE: ");
                String cidade = input.nextLine();
                System.out.print("INFORME O ESTADO: ");
                String estado = input.nextLine();

                float emprestimos = clientesDAO.getClientes().get(index).getEmprestimos().getEmprestimo();
                float divida = clientesDAO.getClientes().get(index).getEmprestimos().getDivida();

                Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                Emprestimos emprestimo = new Emprestimos(emprestimos, divida);
                Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimo);

                if (clientesDAO.getClientes().contains(cliente)) {
                    System.out.println("..........................................");
                    System.out.println("        ERRO.: CLIENTE JÁ CADASTRADO!!!");
                    System.out.println("..........................................\n");            
                } else{
                    clientesDAO.alterarClienteIndex(index, cliente);
                    System.out.println("..........................................");
                    System.out.println("        CLIENTE ALTERADO COM SUCESSO!!!");
                    System.out.println("..........................................\n");              
                }
                
            }else {
                mensIndexInvalido();
            }
        } else {
            mensCadastroVazio();
        }
        }catch(NomeInvalidoException e){ 
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }catch(TelefoneInvalidoException e){
            System.out.println(e.getMessage());
        }catch(RuaInvalidoException e){
            System.out.println(e.getMessage());
        }catch(EnderecoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    private void getListaCliente() {
        System.out.println("..........................................");
        System.out.println("           OPÇÃO LISTAR CLIENTES\n");
        
        if (!clientesDAO.getClientes().isEmpty()) {
            clientesDAO.getClientes().forEach(System.out::println);
        } else {
            mensCadastroVazio();
        }
    }

    private void getObjetoCliente() {
        try{
            
        System.out.println("..........................................");
        System.out.println("    OPÇÃO MOSTRAR CLIENTE POR INDEX\n");
        
        if (!clientesDAO.getClientes().isEmpty()) {
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                String cpf = clientesDAO.getClientes().get(i).getCpf();
                System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                    + ", CPF: " + imprimeCPF(cpf));
            }

            Scanner input = new Scanner(System.in);
            
            System.out.println("..........................................");
            System.out.print("\nDIGITE O INDEX: ");
            int index = Integer.parseInt(input.nextLine());
            
            if (index > -1 && index < clientesDAO.getClientes().size()) {
                System.out.println(clientesDAO.getClientes().get(index));
            }else{
                mensIndexInvalido();
            }
        }else{
            mensCadastroVazio();
        }
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }
    } 
     
    // FINAL METODOS CLIENTES
    
    // COMEÇO METODOS EMPRESTIMOS
    
    private void realizarEmprestimo() throws NomeInvalidoException, CpfInvalidoException, TelefoneInvalidoException, RuaInvalidoException{    
        try{
            
        System.out.println("..........................................");
        System.out.println("       OPÇÃO REALIZAR EMPRESTIMO\n");
        
        if (!clientesDAO.getClientes().isEmpty()) {
            boolean controle = true;
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                if (clientesDAO.getClientes().get(i).getEmprestimos().getDivida() == 0) {
                    String cpf = clientesDAO.getClientes().get(i).getCpf();
                    System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                    + ", CPF: " + imprimeCPF(cpf));
                    controle = false;
                }
            }
            if (controle) {
                    System.out.println("..........................................");
                    System.out.println("    ERRO.: NENHUM CLIENTE DIPOSNILVEL ");
                    System.out.println("    PARA SER EFETURADO O EMPRESTIMO!!!");
                    System.out.println("..........................................\n");
            }
            
            if (!controle) {
                Scanner input = new Scanner(System.in);
                
                System.out.println("..........................................");
                System.out.print("DIGITE O INDEX: ");
                int index = Integer.parseInt(input.nextLine());

                if (index > -1 && index < clientesDAO.getClientes().size() && 
                        clientesDAO.getClientes().get(index).getEmprestimos().getDivida() == 0) {   

                        String nome = clientesDAO.getClientes().get(index).getNome();
                        String cpf = clientesDAO.getClientes().get(index).getCpf();

                        String telefone = clientesDAO.getClientes().get(index).getTelefone();
                        String rua = clientesDAO.getClientes().get(index).getEndereco().getRua();
                        String bairro = clientesDAO.getClientes().get(index).getEndereco().getBairro();
                        String cidade = clientesDAO.getClientes().get(index).getEndereco().getCidade();
                        String estado = clientesDAO.getClientes().get(index).getEndereco().getEstado();
                        int numero = clientesDAO.getClientes().get(index).getEndereco().getNumero();
                        
                        System.out.print("...........................................................\n"
                                        +    "                  INFORMAÇÇOES\n"
                                        + "+ ---> VALOR R$1.000,00 A R$1.999,99 REAIS, "
                                        + "\nCOBRAMOS 8% DE JUROS AO MÊS PARCELANDO EM ATÉ 2 A 6 VEZES\n"
                                        + "\n+ ---> VALOR R$2.000,00 A R$3.999,99 REAIS, "
                                        + "\nCOBRAMOS 6% DE JUROS AO MÊS PARCELANDO EM ATÉ 2 A 7 VEZES\n"
                                        + "\n+ ---> VALOR R$4.000,00 A R$7.999,99 REAIS, "
                                        + "\nCOBRAMOS 4% DE JUROS AO MÊS PARCELANDO EM ATÉ 2 A 8 VEZES\n"
                                        + "\n+ ---> VALOR R$8.000,00 A R$10.000,00 REAIS, "
                                        + "\nCOBRAMOS 2% DE JUROS AO MÊS PARCELANDO EM ATÉ 2 A 9 VEZES\n"
                                        + "\n+OPÇÂO: ");
                        
                        System.out.print("INFORME O VALOR DO EMPRESTIMO: ");
                        float emprestimos = Float.parseFloat(input.nextLine());
                                    
                        if (emprestimos >= 1000 && emprestimos < 2000) {
                            System.out.print("INFORME OS MESES A SER PACELADO: ");
                            int meses = Integer.parseInt(input.nextLine());
                            
                            if (meses >= 2 && meses <= 6) {
                                float saldoDevedor = emprestimos;
                                int cont = 0;

                                while(cont < meses){
                                    saldoDevedor = (((saldoDevedor * 8)/100) + saldoDevedor);
                                    cont++;
                                }

                                Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                                Emprestimos emprestimo = new Emprestimos(emprestimos, Math.round(saldoDevedor));
                                Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimo);

                                clientesDAO.alterarClienteIndex(index, cliente);

                                mensEmprestimoRealizado();                    
                                
                            }else{
                                mensErroNoParcelamento();                                    
                            }

                        }
                        else if (emprestimos >= 2000 && emprestimos < 4000) {
                            System.out.print("INFORME OS MESES A SER PACELADO: ");
                            int meses = Integer.parseInt(input.nextLine());
                            
                            if (meses >= 2 && meses <= 7) {
                                float saldoDevedor = emprestimos;
                                int cont = 0;

                                while(cont < meses){
                                    saldoDevedor = (((saldoDevedor * 6)/100) + saldoDevedor);
                                    cont++;
                                }

                                Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                                Emprestimos emprestimo = new Emprestimos(emprestimos, Math.round(saldoDevedor));
                                Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimo);

                                clientesDAO.alterarClienteIndex(index, cliente);

                                mensEmprestimoRealizado();                    
                                
                            }else{
                                mensErroNoParcelamento();                                    
                            }

                        }
                        else if (emprestimos >= 4000 && emprestimos < 7000) {
                            System.out.print("INFORME OS MESES A SER PACELADO: ");
                            int meses = Integer.parseInt(input.nextLine());
                            
                            if (meses >= 2 && meses <= 8) {
                                float saldoDevedor = emprestimos;
                                int cont = 0;

                                while(cont < meses){
                                    saldoDevedor = (((saldoDevedor * 4)/100) + saldoDevedor);
                                    cont++;
                                }

                                Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                                Emprestimos emprestimo = new Emprestimos(emprestimos, Math.round(saldoDevedor));
                                Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimo);

                                clientesDAO.alterarClienteIndex(index, cliente);

                                mensEmprestimoRealizado();                    
                                
                            }else{
                                mensErroNoParcelamento();                                    
                            }

                        }
                        else if (emprestimos >= 8000 && emprestimos <= 10000) {
                            System.out.print("INFORME OS MESES A SER PACELADO: ");
                            int meses = Integer.parseInt(input.nextLine());
                            
                            if (meses >= 2 && meses <= 9) {
                                float saldoDevedor = emprestimos;
                                int cont = 0;

                                while(cont < meses){
                                    saldoDevedor = (((saldoDevedor * 2)/100) + saldoDevedor);
                                    cont++;
                                }

                                Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                                Emprestimos emprestimo = new Emprestimos(emprestimos, Math.round(saldoDevedor));
                                Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimo);

                                clientesDAO.alterarClienteIndex(index, cliente);

                                mensEmprestimoRealizado();                    
                                
                            }else{
                                mensErroNoParcelamento();                                    
                            }
                        }else{
                            mensValorIncorreto();
                    }                                       
            }else{
                mensIndexInvalido();
            } 
        }
        }else {
            mensCadastroVazio();
        }
        }catch(NomeInvalidoException e){ 
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }catch(TelefoneInvalidoException e){
            System.out.println(e.getMessage());
        }catch(RuaInvalidoException e){
            System.out.println(e.getMessage());
        }catch(EnderecoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void getListaEmprestimo() {
        System.out.println("..........................................");
        System.out.println("       OPÇÃO LISTAR EMPRESTIMOS\n");
        
        if (!clientesDAO.getClientes().isEmpty()) {
            boolean cont = true;
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                if (clientesDAO.getClientes().get(i).getEmprestimos().getDivida() > 0) {
                    System.out.println(clientesDAO.getClientes().get(i));
                    cont = false;
                }
            }
            if (cont) {
                    System.out.println("..........................................");
                    System.out.println(" ERRO.: NENHUM EMPRESTIMO EMCONTRADO!!!");
                    System.out.println("..........................................\n");
            }
        }else {
            mensCadastroVazio();
        }
    }
    
    private void getObjetoEmprestimo() {
        try{
        
        System.out.println("..........................................");
        System.out.println("  OPÇÃO MOSTRAR EMPRESTIMO POR INDEX\n");       
        boolean cont = true;
        
        if (!clientesDAO.getClientes().isEmpty()) {
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                if (clientesDAO.getClientes().get(i).getEmprestimos().getDivida() > 0){
                    String cpf = clientesDAO.getClientes().get(i).getCpf();
                    System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                        + ", CPF: " + imprimeCPF(cpf));
                    cont = false;
                }
            }
            if (cont) {
                System.out.println("..........................................");
                System.out.println(" ERRO.: NENHUM EMPRESTIMO EMCONTRADO!!!");
                System.out.println("..........................................\n");
            }
            if (!cont) {
                Scanner input = new Scanner(System.in);
                
                System.out.println("..........................................");
                System.out.print("\nDIGITE O INDEX: ");
                int index = Integer.parseInt(input.nextLine());

                if (index > -1 && index < clientesDAO.getClientes().size() && 
                        clientesDAO.getClientes().get(index).getEmprestimos().getDivida() != 0) {
                   
                        System.out.println(clientesDAO.getClientes().get(index));
                    
                }else{
                    mensIndexInvalido();
                }
            }
        }else {
            mensCadastroVazio();
        }
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }
    }
  
    private void pagamentoEmprestimo() throws NomeInvalidoException, CpfInvalidoException, TelefoneInvalidoException, RuaInvalidoException {
        try{
        
        System.out.println("..........................................");
        System.out.println("        OPÇÃO EFETUAR PAGAMENTO\n");
        boolean cont = true;
        
        if (!clientesDAO.getClientes().isEmpty()) {
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                if (clientesDAO.getClientes().get(i).getEmprestimos().getDivida() > 0){
                    String cpf = clientesDAO.getClientes().get(i).getCpf();
                    System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                        + ", CPF: " + imprimeCPF(cpf)
                        + ", DIVIDA: " + clientesDAO.getClientes().get(i).getEmprestimos().getDivida());
                    cont = false;
                }
            }
            if (cont) {
                System.out.println("..........................................");
                System.out.println(" ERRO.: NENHUM EMPRESTIMO EMCONTRADO!!!");
                System.out.println("..........................................\n");
            }
            if (!cont) {
                Scanner input = new Scanner(System.in);

                System.out.println("..........................................");
                System.out.print("\nDIGITE O INDEX: ");
                int index = Integer.parseInt(input.nextLine());

                if (index > -1 && index < clientesDAO.getClientes().size() && 
                        clientesDAO.getClientes().get(index).getEmprestimos().getDivida() != 0) {
                    
                        String nome = clientesDAO.getClientes().get(index).getNome();
                        String cpf = clientesDAO.getClientes().get(index).getCpf();

                        String telefone = clientesDAO.getClientes().get(index).getTelefone();
                        String rua = clientesDAO.getClientes().get(index).getEndereco().getRua();
                        String bairro = clientesDAO.getClientes().get(index).getEndereco().getBairro();
                        String cidade = clientesDAO.getClientes().get(index).getEndereco().getCidade();
                        String estado = clientesDAO.getClientes().get(index).getEndereco().getEstado();
                        int numero = clientesDAO.getClientes().get(index).getEndereco().getNumero();

                        float emprestimo = clientesDAO.getClientes().get(index).getEmprestimos().getEmprestimo();
                        float divida = clientesDAO.getClientes().get(index).getEmprestimos().getDivida();

                        System.out.print("INFORME O VALOR A SER PAGO: ");
                        float pagamento = Float.parseFloat(input.nextLine());

                        if (pagamento > 0 && pagamento <= divida) {
                            float faltaPagar = divida - pagamento;
                            
                            Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                            Emprestimos emprestimos = new Emprestimos(emprestimo, faltaPagar);
                            Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimos);
                            
                            clientesDAO.alterarClienteIndex(index, cliente);
                            
                            System.out.println("..........................................");
                            System.out.println("   PAGAMENTO EFEITUADO COM SUCESSO!!!");
                            System.out.println("..........................................");

                            if (clientesDAO.getClientes().get(index).getEmprestimos().getDivida() == 0) {
                                emprestimo = 0;
                                
                                emprestimos = new Emprestimos(emprestimo, faltaPagar);
                                cliente = new Cliente(nome, cpf, telefone, endereco, emprestimos);
                                
                                clientesDAO.alterarClienteIndex(index, cliente);
                                
                                System.out.println("            DIVIDA QUITADA");
                                System.out.println("..........................................\n");
                            }else{
                                System.out.println(        "DIVIDA RESTANTE: " + clientesDAO.getClientes().get(index).getEmprestimos().getDivida());
                                System.out.println("..........................................\n");
                            }                    
                        }else{
                            mensValorIncorreto();
                        } 

                }else{
                mensIndexInvalido();
                }
            } 
        }else {
            mensCadastroVazio();
        }
        }catch(NomeInvalidoException e){ 
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }catch(TelefoneInvalidoException e){
            System.out.println(e.getMessage());
        }catch(RuaInvalidoException e){
            System.out.println(e.getMessage());
        }catch(EnderecoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    private void removerEmprestimoIndex() throws NomeInvalidoException, CpfInvalidoException, TelefoneInvalidoException, RuaInvalidoException {
        try{
        
        System.out.println("..........................................");
        System.out.println("   OPÇÃO REMOVER EMPRESTIMO POR INDEX\n");
        boolean cont = true;
        
        if (!clientesDAO.getClientes().isEmpty()) {
            for (int i = 0; i < clientesDAO.getClientes().size(); i++) {
                if (clientesDAO.getClientes().get(i).getEmprestimos().getDivida() > 0){
                    String cpf = clientesDAO.getClientes().get(i).getCpf();
                    System.out.println("INDEX: " + i + ", NOME: " + clientesDAO.getClientes().get(i).getNome()
                        + ", CPF: " + imprimeCPF(cpf));
                    cont = false;
                }
            }
            if (cont) {
                System.out.println("..........................................");
                System.out.println(" ERRO.: NENHUM EMPRESTIMO EMCONTRADO!!!");
                System.out.println("..........................................\n");
            }
            
            if (!cont) {
                Scanner input = new Scanner(System.in);
                
                System.out.println("..........................................");
                System.out.print("\nDIGITE O INDEX: ");
                int index = Integer.parseInt(input.nextLine());

                if (index > -1 && index < clientesDAO.getClientes().size() && 
                        clientesDAO.getClientes().get(index).getEmprestimos().getDivida() != 0) {
                    
                        String nome = clientesDAO.getClientes().get(index).getNome();
                        String cpf = clientesDAO.getClientes().get(index).getCpf();
                        
                        String telefone = clientesDAO.getClientes().get(index).getTelefone();
                        String rua = clientesDAO.getClientes().get(index).getEndereco().getRua();
                        String bairro = clientesDAO.getClientes().get(index).getEndereco().getBairro();
                        String cidade = clientesDAO.getClientes().get(index).getEndereco().getCidade();
                        String estado = clientesDAO.getClientes().get(index).getEndereco().getEstado();
                        int numero = clientesDAO.getClientes().get(index).getEndereco().getNumero();

                        float emprestimo = 0;
                        float divida = 0;

                        Endereco endereco = new Endereco(rua, bairro, cidade, estado, numero);
                        Emprestimos emprestimos = new Emprestimos(emprestimo, divida);
                        Cliente cliente = new Cliente(nome, cpf, telefone, endereco, emprestimos);

                        clientesDAO.alterarClienteIndex(index, cliente);
                                          
                } else {
                    mensIndexInvalido();
                }
            }
        } else {
            mensCadastroVazio();
        }
        }catch(NomeInvalidoException e){ 
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            mensAlgoritimo();
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }catch(TelefoneInvalidoException e){
            System.out.println(e.getMessage());
        }catch(RuaInvalidoException e){
            System.out.println(e.getMessage());
        }catch(EnderecoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
  
    // FINAL METODOS EMPRESTIMOS  

    private int menuOpcaoPrincipal() {
        Scanner input = new Scanner(System.in);

        System.out.print("..........................................\n"
                + "        MONEYLENDER SYSTEM\n"
                + "\n+ [1] - CLIENTE"
                + "\n+ [2] - EMPRESTIMO"
                + "\n+ [0] - SAIR"
                + "\nOPÇÃO: ");

        int opcao = input.nextInt();
        return opcao;
        
    }

    private int menuOpcaoCliente() {
        Scanner input = new Scanner(System.in);

        System.out.print("..........................................\n"
                + "             CLIENTE\n"
                + "\n+ [1] - CADASTRAR CLIENTE"
                + "\n+ [2] - CADASTRAR CLIENTE PELO INDEX"
                + "\n+ [3] - CONSULTAR CLIENTE"
                + "\n+ [4] - ATUALIZAR DADOS DO CLIENTE"
                + "\n+ [5] - REMOVER CLIENTE PELO FINAL"
                + "\n+ [6] - REMOVER CLIENTE PELO INDEX"
                + "\n+ [7] - MOSTRAR TODOS OS CLIENTES"
                + "\n+ [0] - VOLTAR PARA O MENU PRINCIPAL"
                + "\nOPÇÃO: ");
        
        
        int opcao = input.nextInt();
        return opcao;
        
    }

    private int menuOpcaoEmprestimo() {
        Scanner input = new Scanner(System.in);

        System.out.print("..........................................\n"
                + "                EMPRESTIMOS\n"
                + "\n+ [1] - REALIZAR EMPRESTIMO"
                + "\n+ [2] - EFETUAR PAGAMENTO"
                + "\n+ [3] - CULSULTAR EMPRESTIMO"
                + "\n+ [4] - MOSTRAR TODOS OS EMPRESTIMOS"
                + "\n+ [5] - REMOVER EMPRESTIMO PELO INDEX"
                + "\n+ [0] - VOLTAR PARA O MENU PRINCIPAL"
                + "\n+ OPÇÃO: ");

        int opcao = input.nextInt();
        return opcao;
    }

    public void executar() throws NomeInvalidoException, EnderecoInvalidoException, CpfInvalidoException, TelefoneInvalidoException, RuaInvalidoException {
        boolean loop = true;
        boolean loop1 = true;
        boolean loop2 = true;
        
        do {
            try{
            int opcao = menuOpcaoPrincipal();

            switch (opcao) {
                case 1:
                    do {
                        
                        int opcao1 = menuOpcaoCliente();

                        switch (opcao1) {
                            case 1:
                                inserirClienteFinal();
                                break;
                            case 2:
                                inserirClienteIndex();
                                break;
                            case 3:
                                getObjetoCliente();
                                break;
                            case 4:
                                alterarClienteIndex();
                                break;
                            case 5:
                                removerClienteFinal();
                                break;
                            case 6:
                                removerClienteIndex();
                                break;
                            case 7:
                                getListaCliente();
                                break;
                            case 0:
                                System.out.println("..........................................");
                                System.out.println("<<<< VOLTANDO PARA O MENU PRINCIPAL <<<<");
                                System.out.println("..........................................\n");                             
                                loop1 = false;
                                break;
                            default:
                                mensOpcaoInvalida();                             
                                break;
                        }
                    } while (loop1);
                    break;
                case 2:
                    do {
                        int opcao2 = menuOpcaoEmprestimo();

                        switch (opcao2) {
                            case 1:
                                realizarEmprestimo();
                                break;
                            case 2:
                                pagamentoEmprestimo();
                                break;
                            case 3:
                                getObjetoEmprestimo();
                                break;
                            case 4:
                                getListaEmprestimo();
                                break;
                            case 5:
                                removerEmprestimoIndex();
                                break;
                            case 0:
                                System.out.println("..........................................");
                                System.out.println("<<<< VOLTANDO PARA O MENU PRINCIPAL <<<<");
                                System.out.println("..........................................\n");                             
                                loop2 = false;
                                break;
                            default:
                                mensOpcaoInvalida();                             
                                break;
                        }
                    } while (loop2);
                    break;
                case 0:
                    System.out.println("..........................................");
                    System.out.println("   PROGRAMA FINALIZADO COM SUCESSO!!!");
                    System.out.println("..........................................\n");
                    loop = false;
                    break;
                default:
                    mensOpcaoInvalida();                             
                    break;
            }
            }catch(InputMismatchException e){
                mensAlgoritimo();
            }
        } while (loop);
    }
    
        private void mensCadastroVazio(){
        System.out.println("..........................................");
        System.out.println("        ERRO.: CADASTRO VAZIO!!!");
        System.out.println("..........................................\n");
    }
    
    private void mensIndexInvalido(){
        System.out.println("..........................................");
        System.out.println("          ERRO.: INDEX INVALIDO!!!");
        System.out.println("..........................................\n");
    }
    
    private void mensRemover(){
        System.out.println("..........................................");
        System.out.println("  OPÇÃO REMOVER REALIZADO COM SUCESSO!!!");
        System.out.println("..........................................\n");
    }
    
    private void mensCadastrar(){
        System.out.println("..........................................");
        System.out.println(" OPÇÃO CADASTRAR REALIZADO COM SUCESSO!!!");
        System.out.println("..........................................\n"); 
    }
    
    private void mensValorIncorreto(){
        System.out.println("..........................................");
        System.out.println("        ERRO.: VALOR INCORRETO!!!");
        System.out.println("..........................................\n");
    }
    
    private void mensErroNoParcelamento(){
        System.out.println("..........................................");
        System.out.println("       ERRO.: TOTAL DE PARCELAMENTO ");
        System.out.println("          NÃO CONSTA NOS DADOS!!!");                                   
        System.out.println("..........................................\n");
    }
    
    private void mensEmprestimoRealizado(){
        System.out.println("..........................................");
        System.out.println("   EMPRESTIMO REALIZADO COM SUCESSO!!!");
        System.out.println("..........................................\n");
    }
    
    private void mensOpcaoInvalida(){
        System.out.println("..........................................");
        System.out.println("         ERRO.: OPÇÃO INVALIDA!!!");
        System.out.println("..........................................\n");
    }
    
    private void mensAlgoritimo(){
        System.out.println("\n...........................................");
        System.out.println("ERRO.: PREENCHIMENTO INCORRETO DOS DADOS!!!");
        System.out.println("...........................................\n");        
    }
    
    protected String imprimeCPF(String CPF) {
    return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
      CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
    
    public static void main(String[] args) throws NomeInvalidoException, EnderecoInvalidoException, CpfInvalidoException, TelefoneInvalidoException, RuaInvalidoException {
        APP app = new APP();
        app.executar();
    }
}
