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
public class ExemploCollectionsDisjoint {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(26);
        list.add(69);

        Set<Integer> set = new HashSet<>();
        set.add(33);
        set.add(84);

        if (Collections.disjoint(list, set)) {
            System.out.println("Não apresentam elemento em comum...");
        } else {
            System.out.println("As duas coleções (list, set) apresetam algum "
                    + "elemento em comum...");
        }
    }
}
