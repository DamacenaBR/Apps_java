/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author COMPUTER
 */
public class No {
   private No aponteProximo;
   private No aponteAnterior;
   private int numero;
   
   public No (int valor){
       this.aponteAnterior = null;
       this.aponteProximo = null;
       this.numero = valor;
   }

    public No getAponteProximo() {
        return aponteProximo;
    }

    public void setAponteProximo(No aponteProximo) {
        this.aponteProximo = aponteProximo;
    }

    public No getAponteAnterior() {
        return aponteAnterior;
    }

    public void setAponteAnterior(No aponteAnterior) {
        this.aponteAnterior = aponteAnterior;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
