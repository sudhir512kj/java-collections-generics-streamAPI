package com.sudhirmeena.genericsandcollections.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardApp {
    public static <T extends Shape> void drawAll(List<T> shapes) {
        for (T shape: shapes)
            shape.draw();
    }

    // use of unbounded wildcard
    public static void print(List<?> list) {
        for (Object o: list)
            System.out.println(o);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3);
        print(nums);

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        drawAll(rectangles);
    }
}
