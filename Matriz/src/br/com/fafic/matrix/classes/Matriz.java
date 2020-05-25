/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafic.matrix.classes;

import java.util.Random;

/**
 *
 * @author COMPUTER
 */
public class Matriz {
    private int [][] matriz1;
    private int [][][] matriz2;
    
    public Matriz(){
        matriz1 = new int [6][6];
        matriz2 = new int [6][6][3];
    }
    
    public void prencherMatriz(){
        Random gerador = new Random();
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = gerador.nextInt(10);
            }
        }
    }
    
    public void prencherMatriz3D(){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
             
                for (int m = 0; m < matriz2[i][m].length; m++) {
                    matriz2[i][j][m] = matriz1[i][j];
                }
            }
        }
    }
    
    public void imprimirMatriz(){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }   
    
    public void imprimirMatriz3D(){
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("[");
                for (int k = 0; k < matriz2[i][j].length; k++) {
                    System.out.print(matriz2[i][j][k]);
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
