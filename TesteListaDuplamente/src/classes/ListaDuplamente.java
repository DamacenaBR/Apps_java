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
public class ListaDuplamente {
    private No aponteInicio;
    private No aponteUltimo;
    private int tamanho;
    
    public ListaDuplamente(){
        this.aponteInicio = null;
        this.aponteUltimo = null;
        this.tamanho = 0;
    }
    
    public void inserirInicio(int valor){
        No node = new No(valor);
        if (tamanho == 0) {
            this.aponteInicio = node;
            this.aponteUltimo = node;
        }
        else{
            node.setAponteProximo(this.aponteInicio);
            this.aponteInicio.setAponteAnterior(node);
            this.aponteInicio = node;
        }
        this.tamanho++;
    }
    
    public void inserirUltimo(int valor){
        if (tamanho == 0) {
            inserirInicio(valor);
        }
        else{
            No node = new No(valor);
            this.aponteUltimo.setAponteProximo(node);
            node.setAponteAnterior(this.aponteUltimo);
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
    
    public void inserirPosicao(int posicao, int valor){
        if (posicao == 0) {
            inserirInicio(valor);
        }
        else if (tamanho == posicao){
            inserirUltimo(valor);
        }
        else{
            No node = new No(valor);
            No anterior = buscar(posicao - 1);
            No posterior = buscar(posicao);
            
            anterior.setAponteProximo(node);
            node.setAponteAnterior(anterior);
            
            node.setAponteProximo(posterior);
            posterior.setAponteAnterior(node);
            this.tamanho++;
        }
    }
    
    public void removerInicio(){
        this.aponteInicio = this.aponteInicio.getAponteProximo();
        this.aponteInicio.setAponteAnterior(null);
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
            posterior.setAponteAnterior(anterior);
            tamanho--;
        }
    }
    
    public String imprimir(){
        No atual = this.aponteInicio;
        String resposta = "{";
        for (int i = 0; i < tamanho; i++) {
            resposta += atual.getNumero() + ", ";
            atual = atual.getAponteProximo();
        }
        resposta += "}";
        return resposta;
    }
    
    public void removerRepetido(int valor){
        No atual = this.aponteInicio;
        boolean teste;
        for (int i = 0; i < tamanho; i++) {
            teste = true;
            if (valor == atual.getNumero()) {
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
