package com.sudhirmeena.genericsandcollections.basic_generics;

public class App_Without_Generics {
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result is " + result);
    }

    // method overloading
    public static void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result is " + result);
    }
    public static void main(String[] args) {
        add(10, 28);
        add(10.2, 15.2);
    }
}
