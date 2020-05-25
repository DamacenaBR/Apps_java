/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Elder Pereira
 */
public class ExemploQueue3 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Integer(58));
        priorityQueue.add(new Integer(23));
        priorityQueue.add(new Integer(2));
        priorityQueue.add(new Integer(27));
        priorityQueue.add(new Integer(56));
        priorityQueue.add(new Integer(4));
        priorityQueue.add(new Integer(1));

        System.out.println(priorityQueue);

        System.out.println("size: " + priorityQueue.size());
    }
}
