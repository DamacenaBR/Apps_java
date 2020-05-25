/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Elder Pereira
 */
public class ExemploCollectionsSuffle {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(65);
        list.add(83);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);
    }
}
