/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.listamenteencadeada.classes;

/**
 *
 * @author COMPUTER
 */
public class No {
    private Medico medico;
    private No apontadorProximo;
    
    public No (Medico medico){
        this.medico = medico;
        this.apontadorProximo = null;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public No getApontadorProximo() {
        return apontadorProximo;
    }

    public void setApontadorProximo(No apontadorProximo) {
        this.apontadorProximo = apontadorProximo;
    }   
}
