/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author COMPUTER
 */
public class App {

    public static void main(String[] args) {
        Integer[] vetorInt = {1,2,3,4,5,6,7,8};
        Float[] vetorFloat = {2.3f,4.5f,7.5f};
        
        printArray(vetorInt);
        printArray(vetorFloat);
    }
    
    public static <T> void printArray(T[] vetor){
        System.out.print("[ ");
        for(T elemento : vetor){
            System.out.print(elemento + " ");
        }
        System.out.println("]");
    }
    
}
