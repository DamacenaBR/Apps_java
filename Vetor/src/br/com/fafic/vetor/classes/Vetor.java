/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.vetor.classes;

import java.util.Arrays;

/**
 *
 * @author COMPUTER
 */
public class Vetor {
    private int [] vetorInt;
    private int tamanhoReal;

    public Vetor(int capacidade) {
        vetorInt = new int [capacidade];
        tamanhoReal = 0;
    }
    
    public void inserir(int valor){
        for (int i = 0; i < vetorInt.length; i++) {
            if (vetorInt[i] == 0) {
                vetorInt[i] = valor;
                break;
            }
        }
    }
    
    public void insetirOtimizado(int valor){
        if (tamanhoReal < vetorInt.length) {
            vetorInt[tamanhoReal] = valor;
            tamanhoReal++;
        }else{
            System.out.println("Capacidade Máxima!!!");
        }
    }
    
    public int quantidadeDeElemento(){
        return tamanhoReal;
    }
    
    public void imprimir(){
        for (int i = 0; i < vetorInt.length; i++) {
            System.out.println(vetorInt[i]);
        }
    }
    
    public int obterDeUmaPosicao(int posicao){
        return vetorInt[posicao];
    }
    
    public void existe(int elemento){
        boolean teste = true;
        for (int i = 0; i < vetorInt.length; i++) {
            if (elemento == vetorInt[i]) {
                System.out.println("Elemento " + elemento + " Existe!!!");
                teste = false;
                break;
            }
        }
        if (teste) {
            System.out.println("Elemento não Existe");
        }
    }
    
    public void inserirPorElemento(int posicao, int valor){ 
        if (vetorInt[posicao] != 0) {
            if (tamanhoReal < vetorInt.length) {
                for (int i = tamanhoReal; i >= posicao; i--) {  
                    vetorInt[i + 1] = vetorInt[i];
                }
                vetorInt[posicao] = valor;
                tamanhoReal++;
            }
            else{
                System.out.println("Vetor Cheio!!!");
            }
        }
        else{
           vetorInt[posicao] = valor;
           tamanhoReal ++;
        }
    }
    
    public void removerElemento(int elemento){
        if(vetorInt[elemento] != 0) {
            for (int i = elemento; i < tamanhoReal; i++) {
                vetorInt[i] = vetorInt[i + 1];
            }
            tamanhoReal --;
        }else{
            System.out.println("Elemento vazio!!!");
        }  
    }
           
    @Override
    public String toString() {
        return Arrays.toString(vetorInt);
    }  
}
