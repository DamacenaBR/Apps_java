/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.ordenacao.classes;

import java.util.Arrays;

/**
 *
 * @author danyllo
 */
public class Vetor {

    private int[] vetorInt;
    private int tamanhoReal;

    public Vetor(int capacidade) {
        vetorInt = new int[capacidade];
        tamanhoReal = 0;
    }

    public void inserirOtimizado(int valor) {
        if (tamanhoReal < vetorInt.length) {
            vetorInt[tamanhoReal] = valor;
            tamanhoReal++;
        } else {
            System.out.println("Veto com a capacidade máxima");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(vetorInt);

    }    
}
