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
public class Gerente extends FuncionarioAtenticavel{

    public Gerente() {
        
    }

    public Gerente(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade, matricula);
    }
    
    @Override
    public boolean autenticar(String usuario, String senha) {
        if (usuario ==  "admin" && senha == "123") {
            return true;
        }
        return false;
    }
}
