package com.sudhirmeena.genericsandcollections.type_inference;

import java.util.ArrayList;
import java.util.List;

class Bucket<T> {
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
public class App {

    /**
     * - compiler's ability to look at each method invocation and corresponding declaration to
     *      determine the type argument/arguments (such as T) that make the invocation applicable.
     * <p>
     * - the inference algorithm determines: the type of the arguments
     *      + the type that the result is being assigned or returned if available!!!
     * <p>
     * - the inference algorithm tries to find the most specific type that works with all the arguments !!!
     *
     */

    public static <T> void addStore(T t, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the list...");
    }

    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();

        App.addStore("Adam", list);

        // "type witness"
        App.<String>addStore("Daniel", list);
    }

}
