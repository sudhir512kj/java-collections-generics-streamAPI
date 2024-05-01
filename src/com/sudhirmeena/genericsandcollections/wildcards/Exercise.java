package com.sudhirmeena.genericsandcollections.wildcards;

import java.util.*;

public class Exercise {
    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (int i=0; i < source.size(); ++i)
            destination.add(source.get(i));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Adam", "Ana", "Kevin");
        List<String> list2 = new ArrayList<>();
        copy(list, list2);
        System.out.println(list2);
    }
}
