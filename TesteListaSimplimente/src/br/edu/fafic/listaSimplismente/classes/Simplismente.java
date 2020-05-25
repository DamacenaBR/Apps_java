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
public class Simplismente {
    private No aponteInicio;
    private No aponteUltimo;
    private int tamanho;
    
    public Simplismente(){
        this.aponteInicio = null;
        this.aponteUltimo = null;        
        this.tamanho = 0;
    }
    
    public void inserirInicio(int numero){
        No node = new No(numero);
        if (tamanho == 0) {
            this.aponteInicio = node;
            this.aponteUltimo = node;
        }
        else{
            node.setAponteProximo(aponteInicio);
            this.aponteInicio = node;
        }
        this.tamanho++;
    }
    
    public void inserirFinal(int numero){
        if (tamanho == 0) {
            inserirInicio(numero);
        }
        else{
            No node = new No(numero);
            this.aponteUltimo.setAponteProximo(node);
            this.aponteUltimo = node;
            this.tamanho++;
        }
    }
    
    public No buscar(int posicao){
        No atual = this.aponteInicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getAponteProximo();
        }
        return atual;
    }
    
    public void inserirPosicao(int numero, int posicao){
        if (posicao == 0) {
            inserirInicio(numero);
        }
        else if (posicao == tamanho) {
            inserirFinal(numero);
        }
        else{
            No node = new No(numero);
            No anterior = buscar(posicao - 1);
            No posterior = buscar(posicao);
            
            anterior.setAponteProximo(node);
            node.setAponteProximo(posterior);
            this.tamanho++;
        }
    }
    
    public void removerInicio(){
        this.aponteInicio = this.aponteInicio.getAponteProximo();
        this.tamanho--;
    }
    
    public void removerUltimo(){
        No penultimo = buscar(tamanho - 1);
        penultimo.setAponteProximo(null);
        this.aponteUltimo = penultimo;
        this.tamanho--;
    }
    
    public void removerPosicao(int posicao){
        if (posicao == 0) {
            removerInicio();
        }
        else if (posicao == tamanho) {
            removerUltimo();
        }
        else{
            No anterior = buscar(posicao - 1);
            No posterior = buscar(posicao + 1);
            anterior.setAponteProximo(posterior);
            this.tamanho--;
        }
    }
    
    public String imprimir(){
        No atual = this.aponteInicio;
        String resposta = "{ ";
        
        for (int i = 0; i < tamanho; i++) {
            resposta += atual.getNumero() + ", ";
            atual = atual.getAponteProximo();
        }
        resposta += "}";
        return resposta;
    }
    
    public void removerRepetidos(int numero){
        No atual = this.aponteInicio;
        boolean teste;
        for (int i = 0; i <= tamanho; i++) {
            teste = true;
            if (numero == atual.getNumero()) {
                removerPosicao(i);
                teste = false;

            }
            if (teste){
                atual = atual.getAponteProximo();
            }
        }
    }
    
    public void removerIndexImpar(){
        int aux = 0;
        for (int i = 0; i < tamanho; i++) {
            if (aux % 2 != 0) {
                removerPosicao(i);
                aux++;
            }
            aux++;
        }
    }
}
