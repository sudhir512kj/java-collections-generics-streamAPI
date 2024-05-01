package com.sudhirmeena.genericsandcollections.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcardApp {
    public static double sumAll(List<? extends Number> list) {
        double sum = 0;
        for (Number n: list)
            sum += n.doubleValue();
        return sum;
    }

    public static void showAll(List<? extends Number> list) {
        for (Number n: list)
            System.out.println(n);
    }

    public static void main(String[] args) {
        // we can create lists like this
        List<? extends Number> l1 = new ArrayList<Integer>();
        List<? extends Number> l2 = new ArrayList<Double>();
        List<? extends Number> l3 = new ArrayList<Float>();

        // we can use upper bounded wildcards to read items but not to insert
        showAll(l1);
        showAll(Arrays.asList(1.2f, 2.3f, 3.4f));
        System.out.println(sumAll(Arrays.asList(1,2,3)));
    }
}
