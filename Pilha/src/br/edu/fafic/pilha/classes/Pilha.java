/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.pilha.classes;

import java.util.Arrays;

/**
 *
 * @author danyllo
 */
public class Pilha {

    private int[] pilhaInt;
    private int posicaoPilha;

    public Pilha(int capacidade) {
        posicaoPilha = -1;
        pilhaInt = new int[capacidade];

    }

    public void inserirNaPilha(int valor) {
        if (posicaoPilha < pilhaInt.length - 1) {
            pilhaInt[++posicaoPilha] = valor;
        }
    }

    public boolean pilhaVazia() {
        if (posicaoPilha == -1) {
            return true;
        }

        return false;
    }

    public int tamanhoPilha() {
        if (pilhaVazia()) {
            return 0;
        }

        return posicaoPilha + 1;
    }

    public Object topoDaPilha() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilhaInt[this.posicaoPilha];
    }

    public boolean remover() {
        if (pilhaVazia()) {
            return false;
        }
        pilhaInt[posicaoPilha--] = 0;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(pilhaInt);
    }
}
