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
    private int [] filaInt;
    private int inicio, fim;
    
    public Fila(int capacidade){
        this.inicio = 0;
        this.fim = 0;
        filaInt = new int [capacidade];
    }
    
    public boolean filaVazio(){
        if (inicio == fim) {
            return true;
        }
        return false;
    }
    
    public boolean inserir (int valor){
        if (fim == filaInt.length) {
            return false;
        }
        filaInt[fim] = valor;
        fim++;
        return true;
    }
    
    public boolean remover(){
        if (filaVazio()) {
            return false;
        }
        fim--;
        int cont = 0;
        for (int i = 0; i < fim; i++) {
            filaInt[i] = filaInt[i + 1];
            cont++;
        }
        filaInt[cont] = 0;
        return true;
    }

    @Override
    public String toString(){
        return Arrays.toString(filaInt);
    }
}
