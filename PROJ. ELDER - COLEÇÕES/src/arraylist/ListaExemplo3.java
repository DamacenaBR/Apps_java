/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Vector;

/**
 *
 * @author Elder Pereira
 */
public class ListaExemplo3 {

    public static void main(String[] args) {
        Vector<String> vetor = new Vector<>();

        vetor.add("Eler");
        vetor.add("Maria");
        System.out.println(vetor);

        System.out.println("Size: " + vetor.size());
        vetor.add(1, "João");
        System.out.println(vetor);
    }
}
