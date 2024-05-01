package com.sudhirmeena.genericsandcollections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // FIFO - O(1)
        queue.add("Adam");
        queue.add("Kevin");
        queue.add("Ana");
        queue.add("Katy");

        System.out.println("Removing item: " + queue.remove());

        for (String s : queue)
            System.out.println(s);

        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
