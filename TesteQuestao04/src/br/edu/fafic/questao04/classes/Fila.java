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
public class Fila {
    private No aponteInicio;
    private No aponteUltimo;
    private int tamanho;
    
    public Fila (){
        this.aponteInicio = null;
        this.aponteUltimo = null;
        this.tamanho = 0;
    }
    
    public void adFilaEspera(Aviao aviao){
        No node = new No(aviao);
        if (tamanho == 0) {
            this.aponteInicio = node;
            this.aponteUltimo = node;
        }
        else{
            this.aponteUltimo.setAponteProximo(node);
            this.aponteUltimo = node;
        }
        this.tamanho++;
    }
    
    public No buscar (int posicao){
        No atual = this.aponteInicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getAponteProximo();
        }
        return atual;
    }
    
    public boolean filaVazia(){
        if (tamanho == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public void decolagem (){
        if (filaVazia()) {
            System.out.println("Fila de decolagem vazia!");
        }
        else{
            this.aponteInicio = this.aponteInicio.getAponteProximo();
            this.tamanho--;
        }
    }
    
    public String filaDecolagem(){
        No atual = this.aponteInicio;
        String resposta = "";
        for (int i = 0; i < tamanho; i++) {
            resposta += atual.getAviao() + "\n";
            atual = atual.getAponteProximo();      
        }
        return resposta;
    }
    
    public int numAviaoFilaDecol(){
        return this.tamanho;
    }
    
    public void primeiroAviao(){
        System.out.println(this.aponteInicio.getAviao());
    } 
}
