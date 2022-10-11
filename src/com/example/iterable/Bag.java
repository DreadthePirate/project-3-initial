package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;


public class Bag<T> implements Container<T> {
    ArrayList <T> stringBag = new ArrayList<T>();


    @Override
    public boolean isEmpty() {
        return stringBag.isEmpty();
    }

    @Override
    public int size() {
        return stringBag.size();
    }

    @Override
    public void add(T item) {
        stringBag.add(item);

    }

    @Override
    public Iterator<T> iterator() {
        return stringBag.iterator();
    }
}