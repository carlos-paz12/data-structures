package com.github.carlos_paz12.data_structures.stack;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    @Test
    public void shouldAddedToTheTop() {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Github");
        stack.push("Programation");

        assertEquals("Programation", stack.peek());
    }

    @Test
    public void shouldRemoveElementFromTheTop() {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Github");
        stack.push("Programation");

        assertEquals("Programation", stack.pop());
    }

    @Test
    public void shouldThrowExceptionWhenTryingToRemoveFromEmptyStack() {
        assertThrows(NoSuchElementException.class, () -> new Stack<String>().pop());
    }

    @Test
    public void shouldReturnElementFromTheTop() {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Programation");
        stack.push("Github");

        assertEquals("Github", stack.peek());
    }

    @Test
    public void shouldReturnCorrectStackSize() {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Programation");
        stack.push("Github");

        assertEquals(3, stack.size());
    }

    @Test
    public void shouldReturnThatListIsNotEmpty() {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Programation");
        stack.push("Github");

        assertEquals(false, stack.isEmpty());
    }

}
