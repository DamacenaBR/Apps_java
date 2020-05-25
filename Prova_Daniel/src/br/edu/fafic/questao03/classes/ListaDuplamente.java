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
public class ListaDuplamente {
    private No aponteInicio;
    private No aponteUltimo;
    private int tamanho;
    
    public ListaDuplamente(){
        this.aponteInicio = null;
        this.aponteUltimo = null;
        this.tamanho = 0;
    }
    
    public void inserirInicio(Medico medico){
        No node = new No(medico);
        
        if (tamanho == 0) {
            this.aponteInicio = node;
            this.aponteUltimo = node;
        }
        else{
            node.setAponteProximo(aponteInicio);
            this.aponteInicio.setAponteAnterior(node);
            this.aponteInicio = node;
        }
        this.tamanho++;
    }
    
    public void inserirFinal(Medico medico){        
        if (tamanho == 0) {
            inserirInicio(medico);
        }
        else{
            No node = new No(medico);
            node.setAponteAnterior(aponteUltimo);
            this.aponteUltimo.setAponteProximo(node);
            this.aponteUltimo = node;
        }
        tamanho++;
    }
    
    public void inserirPosicao(int posicao, Medico medico){       
        if (posicao == 0) {
            inserirInicio(medico);
        }
        else if (posicao == tamanho) {
            inserirFinal(medico);
        }
        else{
            No node = new No(medico);            
            No anterior = buscar(posicao - 1);
            No posterior = anterior.getAponteProximo();
            
            node.setAponteAnterior(anterior);
            node.setAponteProximo(posterior);
            anterior.setAponteProximo(node);
            posterior.setAponteAnterior(node);
            tamanho++;
        }        
    }
    
    public void removerInicio(){
        this.aponteInicio = this.aponteInicio.getAponteProximo();
        this.aponteInicio.setAponteAnterior(null);     
        this.tamanho--;
    }
    
    public void removerFinal(){
        No penultimo = aponteUltimo.getAponteAnterior();       
        penultimo.setAponteProximo(null);
        this.aponteUltimo = penultimo;
        this.tamanho--;
    }
    
    public void removerPosicao(int posicao){
        if (posicao == 0) {
            removerInicio();
        }
        else if (posicao == tamanho) {
            removerFinal();
        }
        else{
            No anterior = buscar(posicao - 1);
            No posterior = buscar(posicao + 1);
            
            anterior.setAponteProximo(posterior);
            posterior.setAponteAnterior(anterior);
            tamanho--;
        }     
    }
    
    private No buscar(int posicao){
        No atual = this.aponteInicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getAponteProximo();          
        }
        return atual;
    }
    
    public String imprimir(){
        No atual = this.aponteInicio;
        String resposta = "{ ";
        for (int i = 0; i < tamanho; i++) {
            resposta += atual.getMedico().getNome();
            resposta += ", ";
            atual = atual.getAponteProximo();
        }
        resposta += " }";
        return resposta;
    }
    
    public void buscarPorNome(String nome){
        No atual = this.aponteInicio;
        for (int i = 0; i < tamanho; i++) {
            if (atual.getMedico().getNome().equalsIgnoreCase(nome)) {
                System.out.println(atual.getMedico());
                if (i + 1 == tamanho) {
                    removerFinal();
                }
                else{
                    removerPosicao(i);
                }     
                inserirInicio(atual.getMedico());
                break;
            }
            atual = atual.getAponteProximo();
        }
    }
}
