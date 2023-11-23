package com.github.carlos_paz12.data_structures.stack;

import com.github.carlos_paz12.data_structures.linked_list.LinkedList;

public class Stack<T> {

    private LinkedList<T> elements;

    public Stack() {
        this.elements = new LinkedList<>();
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
        return size() == 0;
    }

    public int size() {
        return elements.size();
    }

}
