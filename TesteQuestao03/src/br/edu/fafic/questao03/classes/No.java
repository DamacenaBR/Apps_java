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
    private int numero;
    
    public No (int numero){
        this.aponteAnterior = null;
        this.aponteProximo = null;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
