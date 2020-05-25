/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.LinkedList;

/**
 *
 * @author Elder Pereira
 */
public class ListExemplo2 {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Maria");
        lista.add("Carlos");
        System.out.println(lista);
        lista.add(1, "Elder");
        System.out.println(lista);
        System.out.println("size : " + lista.size());
        System.out.println(lista);
        lista.remove("Elder");
        System.out.println(lista);
        lista.set(1, "Joaquin");
        System.out.println(lista);
    }
}
