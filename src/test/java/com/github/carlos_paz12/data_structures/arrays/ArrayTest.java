package com.github.carlos_paz12.data_structures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayTest {

    @Test
    public void shouldAddAtTheEndOfArray() {
        Array array = new Array(100);
        array.add("Java");
        array.add("Github");
        array.add("Objects");

        assertEquals("Objects", array.get(2));
    }

    @Test
    public void shouldAddAtTheFirstIndexOfArray() {
        Array array = new Array(100);
        array.add("Java");
        array.add("Github");
        array.add("Objects", 0);

        assertEquals("Objects", array.get(0));
    }

    @Test
    public void shouldRemoveFromArray() {
        Array array = new Array(100);
        array.add("Java");
        array.add("Github");
        array.add("Objects");

        array.remove(0);

        assertEquals(2, array.size());
    }

    @Test
    public void shouldContainElement() {
        Array array = new Array(100);
        array.add("Java");
        array.add("Github");
        array.add("Objects");

        assertEquals(true, array.contains("Github"));
    }

    @Test
    public void shouldReturnElement() {
        Array array = new Array(100);
        array.add("Java");
        array.add("Github");
        array.add("Objects");

        assertEquals("Java", array.get(0));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenAddIntoAnInvalidIndex() {
        assertThrows(IllegalArgumentException.class, () -> new Array(100).add("String", 10));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenRemoveFromAnInvalidIndex() {
        assertThrows(IllegalArgumentException.class, () -> new Array(100).remove(10));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenTakingFromAnInvalidIndex() {
        assertThrows(IllegalArgumentException.class, () -> new Array(100).get(10));
    }

    @Test
    public void shouldIncreaseTheSizeOfTheArray() {
        Array array = new Array(10);
        for (int i = 0; i < 20; i++) array.add(i + 1, i);
        assertEquals(20, array.size());
    }

}
