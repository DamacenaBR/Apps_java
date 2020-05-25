/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listexemplo2;

import java.util.LinkedList;

/**
 *
 * @author COMPUTER
 */
public class ListExemplo2 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Bruno");
        lista.add("Maria");
        lista.add("João");
        System.out.println(lista);
        
        lista.add("Elder");
        System.out.println("Size: " + lista.size());
        System.out.println(lista);
        
        lista.remove("Elder");
        System.out.println(lista);
        
        lista.set(1,"Dede");
        System.out.println(lista);
        
    }
}
