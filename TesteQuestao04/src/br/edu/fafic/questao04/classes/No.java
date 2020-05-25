/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao04.classes;

/**
 *
 * @author COMPUTER
 */
public class No {
    private No aponteProximo;
    private Aviao aviao;
    
    public No(Aviao aviao){
        this.aponteProximo = null;
        this.aviao = aviao;
    }

    public No getAponteProximo() {
        return aponteProximo;
    }

    public void setAponteProximo(No aponteProximo) {
        this.aponteProximo = aponteProximo;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
}
