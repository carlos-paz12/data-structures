package com.github.carlos_paz12.data_structures.linked_list;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public void add(E e) {
        if (size == 0) {
            addAtStart(e);
        } else {
            Node<E> newNode = new Node<E>(null, e, null);
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
            size++;
        }
    }

    public void add(int i, E e) {
        checkIsIndexBusy(i);

        if (i == 0) {
            addAtStart(e);
        } else if (i == size) {
            add(e);
        } else {
            Node<E> prev = getNode(i - 1);
            Node<E> next = prev.getNext();
            Node<E> newNode = new Node<E>(prev, e, next);

            prev.setNext(newNode);
            next.setPrev(newNode);
            size++;
        }
    }

    public void addAtStart(E e) {
        if (size == 0) {
            Node<E> newNode = new Node<E>(null, e, null);
            first = newNode;
            last = newNode;
        } else {
            Node<E> newNode = new Node<E>(null, e, first);
            first.setPrev(newNode);
            first = newNode;
        }
        size++;
    }

    public E remove(int i) {
        checkIsIndexBusy(i);

        if (i == 0) {
            return removeAtStart();
        } else if (i == size - 1) {
            return removeAtEnd();
        } else {
            Node<E> prev = getNode(i - 1);
            Node<E> current = prev.getNext();
            Node<E> next = current.getNext();

            prev.setNext(next);
            next.setPrev(prev);

            size--;
            return current.getElement();
        }
    }

    public E removeAtStart() {
        checkIsIndexBusy(0);

        Node<E> oldFirst = first;
        Node<E> newFirst = oldFirst.getNext();
        newFirst.setPrev(null);
        first = newFirst;

        size--;

        if (size == 0) {
            last = null;
        }

        return oldFirst.getElement();
    }

    public E removeAtEnd() {
        checkIsIndexBusy(size - 1);

        if (size == 1) {
            return removeAtStart();
        } else {
            Node<E> oldLast = last;
            Node<E> penul = oldLast.getPrev();
            penul.setNext(null);
            last = penul;
            size--;

            return oldLast.getElement();
        }
    }

    public E get(int i) {
        checkIsIndexBusy(i);
        return getNode(i).getElement();
    }

    public E getFirst() {
        if (first == null) throw new NoSuchElementException();
        return first.getElement();
    }

    public E getLast() {
        if (last == null) throw new NoSuchElementException();
        return last.getElement();
    }

    public int size() {
        return size;
    }

    public boolean contain(E e) {
        Node<E> current = first;
        while (current != null) {
            if (current.getElement().equals(e)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    private Node<E> getNode(int i) {
        Node<E> current = null;

        /*
         * (size >> 1) is equals (size / 2), but the first has more performance
         */
        if (i < (size >> 1)) {
            current = first;
            for (int j = 0; j < i; j++) current = current.getNext();
        } else {
            current = last;
            for (int j = size - 1; j > i; j--) current = current.getPrev();
        }

        return current;
    }

    private void checkIsIndexBusy(int i) {
        if (!isIndexBudy(i))
            throw new NoSuchElementException();
    }

    private boolean isIndexBudy(int i) {
        return i >= 0 && i < size;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder builder = new StringBuilder("[");
        Node<E> current = first;

        for (int i = 0; i < size - 1; i++) {
            builder.append(current.getElement());
            builder.append(", ");
            current = current.getNext();
        }

        builder.append(current.getElement());
        builder.append("]");

        return builder.toString();
    }

}
