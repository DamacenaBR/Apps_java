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
public class ListaSimplesmenteEncadeada {   
    private No apontePrimeiro;
    private No aponteUltimo;
    private int tamanho;
    
    public ListaSimplesmenteEncadeada(){
        this.apontePrimeiro = null;
        this.aponteUltimo = null;
        this.tamanho = 0;
    }
    
    public void inserirInicio(Medico medico){
        No node = new No (medico);      
        if (this.tamanho == 0) {
            this.apontePrimeiro = node;
            this.aponteUltimo = node;
        }
        else{
            node.setApontadorProximo(apontePrimeiro);
            this.apontePrimeiro = node;
        }
        this.tamanho++;
    }
    
    public void inserirFim(Medico medico){       
        if (this.tamanho == 0) {
            inserirInicio(medico);
        }
        else{
            No node = new No(medico);
            this.aponteUltimo.setApontadorProximo(node);
            this.aponteUltimo = node;
            tamanho++;
        }
    }   
    
    public void inserirPosicao(int posicao, Medico medico){
              
        if (tamanho == 0 ) {
            inserirInicio(medico);
        }
        else if(posicao == tamanho){
            inserirFim(medico);
        }
        else{
            No node = new No(medico);
            No anterior = buscar(posicao - 1);
            
            node.setApontadorProximo(anterior.getApontadorProximo());
            anterior.setApontadorProximo(node);
            this.tamanho++;
        }
    }
    
    public No buscar (int posicao){
        No atual = this.apontePrimeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getApontadorProximo();          
        }
        return atual;
    }
        
    public void removerInicio(){
        this.apontePrimeiro = this.apontePrimeiro.getApontadorProximo();
        this.tamanho--;
        }
    
    public void removerFinal(){
        No penultimo = buscar(tamanho - 1);
        penultimo.setApontadorProximo(null);
        this.aponteUltimo = penultimo;
        this.tamanho --;
    }
    
    public void removerPosicao(int posicao){
        if (posicao == 0) {
            removerInicio();
        }
        else if (posicao == tamanho) {
            removerFinal();
        }
        else{
            No anterior = buscar( posicao - 1);
            No atual = buscar(posicao);           
            anterior.setApontadorProximo(atual.getApontadorProximo());
            tamanho --;
        }   
    }
    
    public String imprimir(){
        No atual = this.apontePrimeiro;
        String resposta = "{ ";
        for (int i = 0; i < tamanho; i++) {
            resposta += atual.getMedico().getNome();
            resposta += ", ";
            atual = atual.getApontadorProximo();           
        }
        resposta += " }";
        return resposta;
    }    
}
