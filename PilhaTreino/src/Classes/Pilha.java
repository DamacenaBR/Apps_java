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
        pilhaInt = new int [capacidade];
        this.posicaoPilha = -1;
    }
    
    public void inserir(int valor){
        if (posicaoPilha < pilhaInt.length - 1) {
            pilhaInt[++posicaoPilha] = valor;
        }else{
            System.out.println("Pilha cheia!!!");
        }
    }
    
    public boolean pilhaVazia(){
        if (posicaoPilha == -1) {
            return true;
        }
        return false;
    }
    
    public int tamanhoPilha(){
        if (pilhaVazia()) {
            return 0;
        }
        return posicaoPilha + 1;
    }
    
    public Object topoDaPilha(){
        if (pilhaVazia()) {
            return null;
        }
        return pilhaInt[posicaoPilha];
    }
    
    public boolean remover(){
        if (pilhaVazia()) {
            return false;
        }
        pilhaInt[posicaoPilha] = 0;
        return true;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(pilhaInt);
    }
}
