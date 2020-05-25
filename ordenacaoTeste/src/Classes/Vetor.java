/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Arrays;

/**
 *
 * @author COMPUTER
 */
public class Vetor {
    private Aluno [] aluno;
    private int tamanhoReal;
    
    public Vetor(int capacidade){
        this.tamanhoReal = 0;
        this.aluno = new Aluno [capacidade];
    }
    
    public void inserir(Aluno valor){
        if (tamanhoReal < aluno.length) {
            aluno[tamanhoReal] = valor;
            tamanhoReal++;
        }
    }
    
    public void inserirPosicao(int posicao, Aluno valor){
        if (aluno[posicao] != null) {
            for (int i = tamanhoReal; i >= posicao; i--) {
                aluno[i + 1] = aluno[i];
            }
            aluno[posicao] = valor;
            this.tamanhoReal++;
        }
        else{
            aluno[posicao] = valor;
            this.tamanhoReal++;
        }        
    }
    
    public String totring(){
        return Arrays.toString(aluno);
    }
    
    @Override
    public String toString(){
        return Arrays.toString(aluno);
    }
    
    public void imprimir(){
        for (int i = 0; i < tamanhoReal; i++) {
            System.out.println(aluno[i]);
        }
        
    }
}
