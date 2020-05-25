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
    
    public void inserir(int numero){
        if (numero % 2 == 1) {
            No node = new No(numero);
            if (tamanho == 0) {
                this.aponteInicio = node;
                this.aponteUltimo = node;
            }
            else{
                this.aponteUltimo.setAponteProximo(node);
                node.setAponteAnterior(this.aponteUltimo);
                this.aponteUltimo = node;
            }
            this.tamanho++;
        }
        else{
            System.out.println("O numero "+ numero + " não é impar!");
        }
    }
    
    public void listaMult(ListaDuplamente lista1, ListaDuplamente lista2){
        No atual = lista1.aponteInicio;
        for (int i = 0; i < lista1.tamanho; i++) {
            lista2.inserir(atual.getNumero() * 3);
            atual = atual.getAponteProximo();
        }
    }
    
    public void duplicarLista(ListaDuplamente lista1, ListaDuplamente lista2, ListaDuplamente lista3){
        No atual1 = lista1.aponteInicio;
        No atual2 = lista2.aponteInicio;
        for (int i = 0; i < lista1.tamanho; i++) {
            lista3.inserir(atual1.getNumero());
            atual1 = atual1.getAponteProximo();
        }
        for (int i = 0; i < lista2.tamanho; i++) {
            lista3.inserir(atual2.getNumero());
            atual2 = atual2.getAponteProximo();
        }
    }
    
    public String imprimir(){
        No atual = this.aponteInicio;
        String resposta = "Lista Numeros: ";
        for (int i = 0; i < tamanho; i++) {
            resposta += atual.getNumero() + ", ";
            atual = atual.getAponteProximo();
        }
        return resposta;
    }
}
