package org.example.sandbox.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {

    private final List<T> stack;

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public T peek() {
        return stack.getLast();
    }

    @Override
    public T pop() {
        return stack.removeLast();
    }

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public int search(T e) {
        int index = stack.lastIndexOf(e);
        if (index == -1) return -1;
        return stack.size() - index - 1;
        //return index == -1 ? stack.size() - index - 1 : -1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stack");
        sb.append(stack);
        return sb.toString();
    }
}
