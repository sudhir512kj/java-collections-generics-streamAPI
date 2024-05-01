package com.sudhirmeena.genericsandcollections.list;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Adam");
        names.push("Joe");
        names.push("Ana");
        names.push("Daniel");
        names.push("Katy");

        System.out.println(names.peek());

        System.out.println(names.size());
        System.out.println(names.pop());
        System.out.println(names.size());

        while (!names.isEmpty())
            System.out.println(names.pop());
    }
}
