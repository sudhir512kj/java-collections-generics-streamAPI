package com.sudhirmeena.genericsandcollections.homework2;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private static final int CAPACITY = 5;
    private List<Pair> cache;

    public Cache() {
        this.cache = new ArrayList<>();
    }

    public void search(String url) {
        Pair searchedItem = null;

        for (Pair pair: cache)
            if (pair.getUrl().equals(url))
                searchedItem = pair;

        if (searchedItem != null) {
            cache.remove(searchedItem);
            cache.add(0, searchedItem);
        } else {
            Pair newPair = new Pair(url, "random data for the given URL");

            if (cache.size() >= CAPACITY) cache.remove(CAPACITY - 1);

            if (cache.isEmpty())
                cache.add(newPair);
            else
                cache.add(0, newPair);
        }
    }

    public void showCache() {
        for (Pair pair: cache)
            System.out.println(pair);
    }
}
