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
public class Hash {
    int [] tabelaHash;
    
    public Hash(){
        tabelaHash = new int[10];
    }
    
    public int funcaoHash(int valor){
        return valor % 9;
    }
    
    public void inserir(int valor){
        int posicao = funcaoHash(valor);
        int limite = tabelaHash.length - 1;
        
        if (tabelaHash[posicao] != 0) {
            posicao++;
        }
        if (posicao >= limite) {
            posicao = 0;
            while(tabelaHash[posicao] != 0){
                if (posicao < tabelaHash.length) {
                    tabelaHash[posicao] = valor;
                }
            }
        }
        else{
            tabelaHash[posicao] = valor;
        }    
    }
    
    public int buscaBinaria(int [] vetor, int inicio, int fim, int valor){
        int meio = (inicio + fim) / 2;
        if (vetor[meio] == valor) {
            return meio;
        }
        if (inicio >= fim) {
            return -1;
        }
        if (vetor[meio] < valor) {
         return buscaBinaria(vetor, meio + 1, fim, valor);
        }
        else if (vetor[meio] > valor) {
            return buscaBinaria(vetor, inicio, meio - 1, valor);
        }
        return -1;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(tabelaHash);
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
//    public void inserir(int valor){
//        int posicao = funcaoHash(valor);
//        int limite = tabelaHash.length - 1;
//        if (tabelaHash[posicao] != 0) {
//            posicao++;
//        }
//        if (posicao >= limite) {
//            posicao = 0;
//            
//            while (tabelaHash[posicao] != 0) {
//                if (posicao < tabelaHash.length) {
//                    tabelaHash[posicao] = valor;
//                }
//            }
//        } else {
//            tabelaHash[posicao] = valor;
//        }
//    }
    
    public int buscar(int valor){
        return funcaoHash(valor);
    }
    
    @Override
    public String toString(){
        return Arrays.toString(tabelaHash);
    }

}
