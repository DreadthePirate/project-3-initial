package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


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
    /*
    TODO implement this method
    @Override
    public void forEach(Consumer<? super T> action) {
        for (T t : this)
            action.accept(t);
            stringBag.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return stringBag.spliterator();
    }
     */
}