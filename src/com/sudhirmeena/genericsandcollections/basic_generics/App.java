package com.sudhirmeena.genericsandcollections.basic_generics;

class Store<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

class HashTable<K, V> {
    private K key;
    private V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class App {

    public static void main(String[] args) {
        // raw type
        // <> diamond operator
        Store<Integer> store = new Store<>();

        store.setItem(45);
        // we can cast Object into any other object
        // this code we need to change if we want a different type of input and output in case if we use Object as type
        // we can get run time errors
        int item = store.getItem();
        System.out.println(item);

        HashTable<String, Integer> hashTable = new HashTable<>("Hello", 23);
        System.out.println(hashTable);

        GenericMethod method = new GenericMethod();
        method.printItems("Sudhir", 28);
        System.out.println("Item returned is: " + method.showItem(item));

        Integer[] nums = {1,2,3,4,5};
        String[] names = {"Sudhir", "Shalu"};
        method.showItem(nums);
        method.showItem(names);
    }
}
