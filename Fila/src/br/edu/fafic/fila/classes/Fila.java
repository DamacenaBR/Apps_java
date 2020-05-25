/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.fila.classes;

/**
 *
 * @author danyllo
 */
public class Fila {

    static final int MAX = 10;

    private int inicio = 0, fim = 0;
    private int[] fila = new int[MAX];

    public int incr(int i) {
        if (i == Fila.MAX - 1) {
            return 0;
        } else {
            return i + 1;
        }
    }

    public void inserir(Fila f, int valor) {
        if (incr(f.fim) == f.inicio) {
            System.out.println("Capacidade da fila estourou!");
            System.exit(1);
        }
        f.fila[f.fim] = valor;
        f.fim = incr(f.fim);
    }

    public boolean vazia(Fila f) {
        return (f.inicio == f.fim);
    }

    public int remover(Fila f) {
        int valor;
        if (vazia(f)) {
            System.out.println("Fila vazia!");
            System.exit(1);
        }
        valor = f.fila[f.inicio];
        f.inicio = incr(f.inicio);
        return valor;
    }

    public void imprimir(Fila f) {
        int i;
        for (i = f.inicio; i != f.fim; i = incr(i)) {
            System.out.println(f.fila[i]);

        }

    }

}
