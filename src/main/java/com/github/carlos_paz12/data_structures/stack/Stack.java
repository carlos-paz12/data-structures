package com.github.carlos_paz12.data_structures.stack;

import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> elements;

    public Stack(LinkedList<T> elements) {
        this.elements = elements;
    }

    public void push(T t) {
        elements.add(t);
    }

    public T pop() {
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

}
