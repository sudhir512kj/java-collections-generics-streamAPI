package com.sudhirmeena.genericsandcollections.map;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode = hash-function
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // There some rules:
    // 1. if two objects are equal then they must have the same hash code
    // 2. if two objects have same hash code then they may or may not be equal

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
