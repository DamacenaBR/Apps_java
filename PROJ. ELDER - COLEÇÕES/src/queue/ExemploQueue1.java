/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Elder Pereira
 */
public class ExemploQueue1 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("primeiro");
        queue.offer("segundo");
        queue.offer("terceiro");

        System.out.println("Primeiro elemento: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("size: " + queue.size());
    }
}
