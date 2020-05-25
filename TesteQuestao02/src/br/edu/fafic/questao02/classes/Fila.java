/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao02.classes;

/**
 *
 * @author COMPUTER
 */
public class Fila {
    private No aponteInicio;
    private No aponteUltimo;
    private int tamanho;
    
    public Fila(){
        this.aponteInicio = null;
        this.aponteUltimo = null;
        this.tamanho = 0;
    }
    
    public void inserir(Aluno aluno){
        No node = new No(aluno);
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
    
    public No buscar(int posicao){
        No atual = this.aponteInicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getAponteProximo();
        }
        return atual;
    }
    
    public void remover(){
        this.aponteInicio = this.aponteInicio.getAponteProximo();
        this.tamanho--;
    }
    
    public Aluno buscarMatricula(int numero){
        No atual = this.aponteInicio;
        for (int i = 0; i < tamanho; i++) {
            if (numero == atual.getAluno().getMatricula()) {
                return atual.getAluno();
            }
            atual = atual.getAponteProximo();
        }
        return null;
    }
    
    public No elementoInicio(){
        return this.aponteInicio;
    }
    
    public int quantAlunos(){
        return this.tamanho;
    }
    
    public String string(){
        No atual = this.aponteInicio;
        String resposta = "";
        for (int i = 0; i < this.tamanho; i++) {
            resposta += atual.getAluno().getNome() + ", ";
            atual = atual.getAponteProximo();
        }
        return resposta;
    }
}
