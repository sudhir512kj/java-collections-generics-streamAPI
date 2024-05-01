package com.sudhirmeena.genericsandcollections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeApp {
    public static void main(String[] args) {
        // double ended queue (DEQUE)
        // huge one dimensional arrays - O(1)

        // FIFO
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(10);
        deque.offer(100);
        deque.offer(1000);

        while (!deque.isEmpty())
            System.out.println(deque.poll());

        // Deque as stack
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
