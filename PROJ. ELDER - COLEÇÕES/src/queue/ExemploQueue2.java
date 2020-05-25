/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Elder Pereira
 */
public class ExemploQueue2 {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("Elder");
        deque.offerLast("Maria");
        deque.offerFirst("Carlos");

        deque.offer("Fran");

        System.out.println("Primeiro elemento: " + deque.peek());

        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }

        System.out.println("size: " + deque.size());
    }
}
