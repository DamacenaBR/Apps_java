/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pacote.seis;

/**
 *
 * @author 5LabComp2
 */
public class Gerente extends Funcionario implements Autenticavel {

    @Override
    public boolean logar(String usuario, String senha) {
        if(usuario == "admin" && senha == "admin"){
            return true;
        }
        return false;
    }
    
}
