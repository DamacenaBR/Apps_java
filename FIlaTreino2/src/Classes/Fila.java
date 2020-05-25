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
public class Fila {
    private int [] filaInt;
    private int inicio, fim;
    
    public Fila(int capacidade){
        this.inicio = 0;
        this.fim = 0;
        this.filaInt = new int [capacidade];
    }
    
    public boolean filaVazia(){
        if (inicio == fim) {
            return true;
        }
        return false;
    }
    
    public void inserir(int valor){
        if (fim < filaInt.length) {
            this.filaInt[fim++] = valor;
        }
        else{
            System.out.println("fila cheia!!!");
        }
    }
    
    public boolean remover(){
        if (filaVazia()) {
            return false;
        }
        int cont = 0;
        for (int i = 0; i < fim - 1; i++) {
            filaInt[i] = filaInt[i + 1];
            cont++;
        }
        filaInt[cont] = 0;
        fim--;
        return true;        
    }
    
    @Override
    public String toString(){
        return Arrays.toString(filaInt);
    }
}
