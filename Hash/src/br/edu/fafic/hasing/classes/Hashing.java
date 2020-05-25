/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.hasing.classes;

import java.util.Arrays;
/**
 *
 * @author COMPUTER
 */
public class Hashing {
    int [] tabelaHash;
    
    public Hashing(){
        tabelaHash = new int [10];
    }
    
    public int funcaoHash(int valor){
        return valor % 10;
    }
    
    public void inserir(int valor){
        int posicao = funcaoHash(valor);
        int limite = tabelaHash.length - 1;
        if (tabelaHash[posicao] != 0) {
            posicao++;
        }
        if (posicao >= limite) {
            posicao = 0;

            while (tabelaHash[posicao] != 0) {
                if (posicao < tabelaHash.length) {
                    tabelaHash[posicao] = valor;
                }
            }
        } else {
            tabelaHash[posicao] = valor;
        }
    }
    
    public void imprimir(){
        System.out.println(Arrays.toString(tabelaHash));
    }
    
    public int buscar(int valor){
        return funcaoHash(valor);
    }
    
}
