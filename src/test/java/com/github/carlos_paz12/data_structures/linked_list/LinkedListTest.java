package com.github.carlos_paz12.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LinkedListTest {

    @Test
    public void shouldBeAddedToTheEndOfTheList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        assertEquals("[Java, Github, Data]", list.toString());
    }

    @Test
    public void shouldAddedToTheStartOfTheList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.addAtStart("Github");
        list.addAtStart("Data");

        assertEquals("[Data, Github, Java]", list.toString());
    }

    @Test
    public void shouldBeAddedInTheSpecifiedIndex() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add(0, "Github");
        list.add("Data");

        assertEquals("Github", list.get(0));
    }

    @Test
    public void shouldThrowNoSuchElementExceptionWhenTryingToAddToInvalidIndex() {
        try {

            LinkedList<String> list = new LinkedList<>();
            list.add("Java");
            list.add(5, "Github");
            list.add("Data");

            fail("Did not throw correct exception");

        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void shouldRemoveFromASpecifiedIndex() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        list.remove(0);

        assertEquals("[Github, Data]", list.toString());
    }

    @Test
    public void shouldThrowNoSuchElementExceptionWhenTryingToRemoveFromInvalidIndex() {
        try {

            LinkedList<String> list = new LinkedList<>();
            list.add("Java");
            list.add("Github");
            list.add("Data");

            list.remove(10);

            fail("Did not throw correct exception");

        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void shouldRemoveFromStartOfList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        list.removeAtStart();
        list.removeAtStart();

        assertEquals("[Data]", list.toString());
    }

    @Test
    public void shouldRemoveFromEndOfList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        list.removeAtEnd();
        list.removeAtEnd();

        assertEquals("[Java]", list.toString());
    }

    @Test
    public void shouldThrowExceptionWhenTryingToRemoveElementFromEmptyList() {
        try {

            LinkedList<String> list = new LinkedList<>();

            list.remove(1);

            fail("Did not throw correct exception");

        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void shouldGetSpecifiedIndex() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        assertEquals("Data", list.get(2));
    }

    @Test
    public void shouldThrowExceptionWhenTryingGetSpecifiedIndexInvalid() {
        try {

            LinkedList<String> list = new LinkedList<>();
            list.add("Java");
            list.add("Github");

            list.get(3);

            fail("Did not throw correct exception");

        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void shouldGetAFirstElementOfTheList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        assertEquals("Java", list.getFirst());
    }

    @Test
    public void shouldGetALastElementOfTheList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        assertEquals("Data", list.getLast());
    }

    @Test
    public void shouldThrowExceptionWhenTryingToGetFirstElementOfAnEmptyList() {
        try {

            LinkedList<String> list = new LinkedList<>();

            list.getFirst();

            fail("Did not throw correct exception");

        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void shouldThrowExceptionWhenTryingToGetLastElementOfAnEmptyList() {
        try {

            LinkedList<String> list = new LinkedList<>();

            list.getLast();

            fail("Did not throw correct exception");

        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void shouldReturnActualSizeOfTheList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        assertEquals(3, list.size());
    }

    @Test
    public void shouldContainElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        assertEquals(true, list.contain("Java"));
    }

    @Test
    public void shouldNotContainElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Github");
        list.add("Data");

        assertEquals(false, list.contain("PHP"));
    }

}
