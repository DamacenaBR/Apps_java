/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listexemplo1;

import java.util.ArrayList;

/**
 *
 * @author COMPUTER
 */
public class ListExemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Bruno");
        lista.add("Silva");
        lista.add("Damacena");  
        System.out.println("Size: " + lista.size());
        System.out.println(lista);
        
        lista.set(1,"Maria");
        System.out.println(lista);
        
        lista.set(2, "João");
        System.out.println(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        
        lista.forEach(System.out::println);
        
    }
    
}
