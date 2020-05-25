/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao01.classes;

/**
 *
 * @author COMPUTER
 */
public class Pilha {
    private No aponteInicio;
    private No aponteUltimo;
    private int tamanho;
    
    public Pilha (){
        this.aponteInicio = null;
        this.aponteUltimo = null;
        this.tamanho = 0;
    }
    
    public void empilhar(int valor){
        if (valor % 2 == 0) {
            No node = new No(valor);
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
        else if (valor % 2 == 1) {
            desempilhar();
        }
        else{
            System.out.println("Valor incorreto!");
        }
    }
    
    public void desempilhar(){
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
        }
        else{
            No anterior = buscar(tamanho - 1);
            this.aponteUltimo = anterior;
            anterior.setAponteProximo(null);
            this.tamanho--;
        }
    }
    
    public boolean pilhaVazia(){
        if (tamanho == 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public No buscar(int posicao){
        No atual = this.aponteInicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getAponteProximo();
        }
        return atual;
    }
    
    public No topoPilha(){
        return buscar(tamanho - 1);
    }
    
    public String string(){
        No atual = this.aponteInicio;
        String resposta = "";
        for (int i = 0; i < tamanho; i++) {
            resposta += atual.getNumero() + ", ";
            atual = atual.getAponteProximo();
        }
        return resposta;
    }
}
