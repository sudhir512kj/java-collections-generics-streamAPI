package com.sudhirmeena.genericsandcollections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>();

        queue.add(new Person("Kevin", 22));
        queue.add(new Person("Joe", 37));
        queue.add(new Person("Adam", 12));
        queue.add(new Person("Ana", 45));

        while (queue.peek() != null)
            System.out.println(queue.poll());
    }
}
