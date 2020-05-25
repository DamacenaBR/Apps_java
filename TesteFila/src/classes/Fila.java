/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Arrays;

/**
 *
 * @author COMPUTER
 */
public class Fila {
    private int [] fila;
    private int inicio, fim;
    
    public Fila (int capacidade){
        this.fila = new int [capacidade];
        this.inicio = 0;
        this.fim = 0;
    }
    
    public void inserir(int valor){
        if (this.fim == this.fila.length) {
            System.out.println("Fila cheia");
        }
        else{
            this.fila[fim++] = valor;
        }
    }
    
    public boolean filaVazia(){
        if (this.inicio == this.fim) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public int tamanhoFila(){
        return this.fim;
    }
    
    public Object comecoFila(){
        if (filaVazia()) {
            return null;
        }
        else{
            return this.fila[inicio];
        }
    }
    
    public void remover(){
        if (filaVazia()) {
            System.out.println("FIla vazia!");
        }
        else{
            this.fim--;
            for (int i = 0; i < fim; i++) {
                fila [i] = fila[i + 1];
            }
            this.fila[fim] = 0;
        }
    }
    
    @Override
    public String toString(){
        return Arrays.toString(fila);
    }
}
