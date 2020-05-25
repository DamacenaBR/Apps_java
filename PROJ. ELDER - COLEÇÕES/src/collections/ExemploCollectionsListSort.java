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
public class ExemploCollectionsListSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(7);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(56);
        list.add(33);
        list.add(43);

        List<Integer> list2 = new ArrayList<>(10);

        System.out.println(list);

        Collections.copy(list2, list);
        System.out.println(list2);
    }
}
