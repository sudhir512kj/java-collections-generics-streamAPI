package com.sudhirmeena.genericsandcollections.bounded_type_parameters;

public class Exercise2 {
    public static <T extends Comparable<T>> int countGreaterItems(T[] items, T item) {
        int count = 0;
        for (T num: items) {
            if (num.compareTo(item) > 0)
                count += 1;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
