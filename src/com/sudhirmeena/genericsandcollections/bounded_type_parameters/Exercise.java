package com.sudhirmeena.genericsandcollections.bounded_type_parameters;

public class Exercise {
    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(add(23, 45));
        System.out.println(add(2.45, 7.88));
    }
}
