/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.beans;

import br.edu.fescfafic.exportacao.CpfInvalidoException;
import br.edu.fescfafic.exportacao.NomeInvalidoException;
import br.edu.fescfafic.exportacao.TelefoneInvalidoException;
import java.util.Objects;

/**
 *
 * @author bruno
 */
public class Cliente{
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;
    private Emprestimos emprestimos;

    public Cliente(){
        
    }

    public Cliente(String nome, String cpf, String telefone, Endereco endereco, Emprestimos emprestimo) 
            throws NomeInvalidoException, CpfInvalidoException, TelefoneInvalidoException{
        
        if (nome.isEmpty() || nome.length() < 4 || nome.length() > 20) {
            throw new NomeInvalidoException("  ERRO.: NOME DO CLIENTE INVALIDO!!!");
        }else{
            String vetor[] = {"0","1","2","3","4","5","6","7","8","9"};
            char [] tam = nome.toCharArray();
            for (int i = 0; i < tam.length; i++) {
                String str = Character.toString(nome.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new NomeInvalidoException("  ERRO.: NOME DO CLIENTE INVALIDO!!!");
                    }                    
                }
            }
        }         
        this.nome = nome;
        
        if (cpf.isEmpty() || cpf.length() != 11){
            throw new CpfInvalidoException("  ERRO.:CPF DO CLIENTE INVALIDO!!!");
        }else {
            String vetor[] = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            cpf = cpf.toLowerCase();
            char [] tam = cpf.toCharArray();
            for (int i = 0; i < tam.length; i++) {
                String str = Character.toString(cpf.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new CpfInvalidoException("  ERRO.:CPF DO CLIENTE INVALIDO!!!");
                    }                  
                }
            }
        }
        this.cpf = cpf;
        
        if (telefone.isEmpty() || telefone.length() != 11){
            throw new TelefoneInvalidoException("  ERRO.:TELEFONE DO CLIENTE INVALIDO!!!");
        }else {
            String vetor[] = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            telefone = telefone.toLowerCase();
            char [] tam = telefone.toCharArray();
            for (int i = 0; i < tam.length; i++) {
                String str = Character.toString(telefone.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new TelefoneInvalidoException("  ERRO.:TELEFONE DO CLIENTE INVALIDO!!!");
                    }                  
                }
            }
        }
        this.telefone = telefone;
        
        this.endereco = endereco;
        this.emprestimos = emprestimo;
    } 

    public Emprestimos getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimos emprestimo) {
        this.emprestimos = emprestimo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome.isEmpty() || nome.length() < 4 || nome.length() > 20) {
            throw new NomeInvalidoException("  ERRO.: NOME DO CLIENTE INVALIDO!!!");
        }else{
            String vetor[] = {"0","1","2","3","4","5","6","7","8","9"};
            char [] tam = nome.toCharArray();
            for (int i = 0; i < tam.length; i++) {
                String str = Character.toString(nome.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new NomeInvalidoException("  ERRO.: NOME DO CLIENTE INVALIDO!!!");
                    }                    
                }
            }
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws CpfInvalidoException {
        if (cpf.isEmpty() || cpf.length() != 11){
            throw new CpfInvalidoException("  ERRO.:CPF DO CLIENTE INVALIDO!!!");
        }else {
            String vetor[] = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            cpf = cpf.toLowerCase();
            char [] tam = cpf.toCharArray();
            for (int i = 0; i < tam.length; i++) {
                String str = Character.toString(cpf.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new CpfInvalidoException("  ERRO.:CPF DO CLIENTE INVALIDO!!!");
                    }                  
                }
            }
        }
        this.cpf = cpf;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws TelefoneInvalidoException {
        if (telefone.isEmpty() || telefone.length() != 11){
            throw new TelefoneInvalidoException("  ERRO.:TELEFONE DO CLIENTE INVALIDO!!!");
        }else {
            String vetor[] = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            telefone = telefone.toLowerCase();
            char [] tam = telefone.toCharArray();
            for (int i = 0; i < tam.length; i++) {
                String str = Character.toString(telefone.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new TelefoneInvalidoException("  ERRO.:TELEFONE DO CLIENTE INVALIDO!!!");
                    }                  
                }
            }
        }
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    protected String imprimeCPF(String CPF) {
    return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
      CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
    
    protected String imprimeTelefone(String TELEFONE) {
    return("(" + TELEFONE.substring(0, 2) + ")" + TELEFONE.substring(2, 7) + "-" +
      TELEFONE.substring(7, 11));
    }
    
    @Override
    public String toString(){
        return "CLIENTE: {" + "NOME= " + nome + ", CPF= " + imprimeCPF(cpf) + ", TELEFONE= " + imprimeTelefone(telefone) + "}"+ endereco + emprestimos;
    }

}
