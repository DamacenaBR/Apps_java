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
    private int [] pilha;
    private int posPilha;
    
    public Pilha (int capacidade){
        this.pilha = new int [capacidade];
        this.posPilha = -1;
    }
    
    public void inserir(int valor){
        if (this.posPilha == pilha.length) {
            System.out.println("Pilha cheia!");
        }
        else{
            this.pilha[++posPilha] = valor;
        }
    }
    
    public boolean pilhaVazia(){
        if (this.posPilha == -1) {
            return true;
        }
        return false;
    }
    
    public int tamanhoPilha(){
        return this.posPilha + 1;
    }
    
    public Object topoPilha(){
        if (pilhaVazia()) {
            return null;
        }else{
        return this.pilha[this.posPilha];
        }
    }
    
    public void remover(){
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
        }else{
           this.pilha[this.posPilha--] = 0;
        }       
    }
    
    @Override
    public String toString(){
        return Arrays.toString(pilha);
    }
}
