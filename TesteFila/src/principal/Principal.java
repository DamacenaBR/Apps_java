/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.Fila;

/**
 *
 * @author COMPUTER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        
        fila.inserir(5);
        fila.inserir(6);
        fila.inserir(8);
        fila.inserir(5);
        fila.inserir(10);
        System.out.println(fila.toString());
        
        System.out.println("Inicio da fila: " + fila.comecoFila());
        System.out.println("Tamanho da fila: " + fila.tamanhoFila());
        System.out.println("Fila vazia: " + fila.filaVazia());
        
        System.out.println();
        System.out.println("opção remover!");
        fila.remover();
        System.out.println(fila.toString());
        
        System.out.println("Inicio da fila: " + fila.comecoFila());
        System.out.println("Tamanho da fila: " + fila.tamanhoFila());
        System.out.println("Fila vazia: " + fila.filaVazia());
        
        System.out.println();
        System.out.println("opção remover!");
        fila.remover();
        System.out.println(fila.toString());
        
        System.out.println("Inicio da fila: " + fila.comecoFila());
        System.out.println("Tamanho da fila: " + fila.tamanhoFila());
        System.out.println("Fila vazia: " + fila.filaVazia());
    }
    
}
