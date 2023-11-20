package com.github.carlos_paz12.data_structures.arrays;

public class Array {

    private Object[] elements;
    private int qtdElements;

    public Array(int size) {
        elements = new Object[size];
        qtdElements = 0;
    }

    public void add(Object o) {
        allocateSpace();
        elements[qtdElements] = o;
        qtdElements++;
    }

    public void add(Object o, int index) {
        allocateSpace();
        if (!isValid(index)) throw new IllegalArgumentException();
        for (int i = qtdElements - 1; i >= index; i--) elements[i + 1] = elements[i];
        elements[index] = o;
        qtdElements++;
    }

    public void remove(int index) {
        if (!isBusy(index)) throw new IllegalArgumentException();
        for (int i = index; i < qtdElements - 1; i++) elements[i] = elements[i + 1];
        qtdElements--;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < qtdElements; i++) if (elements[i].equals(o)) return true;
        return false;
    }

    public Object get(int index) {
        if (!isBusy(index)) throw new IllegalArgumentException();
        return elements[index];
    }

    private void allocateSpace() {
        if (qtdElements == elements.length) {
            Object[] o = new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) o[i] = elements[i];
            elements = o;
        }
    }

    public int size() {
        return qtdElements;
    }

    private boolean isBusy(int i) {
        return i >= 0 && i < qtdElements;
    }

    private boolean isValid(int i) {
        return i >= 0 && i <= qtdElements;
    }

}
