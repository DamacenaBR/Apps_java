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
public class Pilha {
    private int [] pilhaInt;
    private int posicaoPilha;

    public Pilha(int capacidade){
        this.pilhaInt = new int[capacidade];
        this.posicaoPilha = -1;
    }
    
    public boolean pilhaVazia(){
        if (posicaoPilha == -1) {
            return true;
        }
        return false;
    }
    
    public void inserir(int valor){
        if (posicaoPilha < pilhaInt.length - 1) {
            this.pilhaInt [++posicaoPilha] = valor;
        }
        else{
            System.out.println("Pilha cheia!!!");
        }
    }
    
    public Object topoPilha(){
        if (pilhaVazia()) {
            return null;
        }
        return this.pilhaInt [posicaoPilha];
    }
    
    public int tamanhoPilha(){
        if (pilhaVazia()) {
            return 0;
        }
        return posicaoPilha + 1;
    }
    
    public boolean remover(){
        if (pilhaVazia()) {
            return false;
        }
        this.pilhaInt [posicaoPilha] = 0;
        this.posicaoPilha --;
        return true;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(pilhaInt);
    }
}
