/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisãoPoo;

/**
 *
 * @author bruno
 */
public abstract class FuncionarioAtenticavel extends Funcionario implements Autenticavel{
    private String login;
    private String senha;

    public FuncionarioAtenticavel() {
        
    }
    
    public FuncionarioAtenticavel(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade, matricula);
    } 

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
    
}
