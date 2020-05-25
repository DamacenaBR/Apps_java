/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listexemplo3;

import java.util.Vector;

/**
 *
 * @author COMPUTER
 */
public class ListExemplo3 {
    public static void main(String[] args) {
        Vector<String> vetor = new Vector<>();
        vetor.add("Bruno");
        vetor.add("Maria");
        System.out.println(vetor);
        System.out.println("Size: " + vetor.size());
        
        vetor.add("João");
        vetor.add(1,"Dede");
        System.out.println(vetor);
        
        
    }
}
