package com.sudhirmeena.genericsandcollections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        // resizing the array takes O(n)
        List<String> names = new ArrayList<>();

        names.add("Kevin");
        names.add("Adam");
        names.add("Ana");

        // random indexing in O(1)
        System.out.println(names.get(0));

        // insert item into a given index - O(n)
        names.add(0, "Daniel");
        names.remove(0);

        // ArrayList (Arrays) are fast if we manipulate the last item

        // contains will check whether the item is present in the array O(n)
        System.out.println(names.contains("Adam"));

        // because of the Iterable interface
        for (String s: names)
            System.out.println(s);

        Object[] o = names.toArray();

        // because of the Iterable interface
        for (Object s: o)
            System.out.println(s);


    }
}
