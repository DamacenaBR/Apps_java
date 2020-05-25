/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao03.classes;

/**
 *
 * @author COMPUTER
 */
public class No {
    private No aponteAnterior;
    private No aponteProximo;
    private Medico medico;
    
    public No (Medico medico){
        this.aponteAnterior = null;
        this.aponteProximo = null;
        this.medico = medico;
    }

    public No getAponteAnterior() {
        return aponteAnterior;
    }

    public void setAponteAnterior(No aponteAnterior) {
        this.aponteAnterior = aponteAnterior;
    }

    public No getAponteProximo() {
        return aponteProximo;
    }

    public void setAponteProximo(No aponteProximo) {
        this.aponteProximo = aponteProximo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
