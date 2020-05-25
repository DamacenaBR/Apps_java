/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Elder Pereira
 */
public class ListExemplo1 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(4);
        lista.add(7);
        System.out.println("Size : " + lista.size());
        System.out.println(lista);
        lista.add(1, 223);
        System.out.println(lista);
        lista.set(2, 987);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (Integer elemento : lista) {
            System.out.println(elemento);
        }

        lista.forEach(System.out::println);

    }
}
