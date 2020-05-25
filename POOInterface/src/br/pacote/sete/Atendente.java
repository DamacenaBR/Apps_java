/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pacote.sete;

/**
 *
 * @author 5LabComp2
 */
public class Atendente extends FuncionarioAutenticavel {
    
    private String ramal;

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public boolean autenticar(String usuario, String senha) {
        return true;
    }
    
    
    
}
