/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.listaSimplismente.classes;

/**
 *
 * @author COMPUTER
 */
public class No {
    private No aponteProximo;
    private int numero;
    
    public No (int numero){
        this.aponteProximo = null;
        this.numero = numero;
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
