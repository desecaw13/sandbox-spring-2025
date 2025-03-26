package org.example.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<T> implements LinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFirst(T element) {
        Node node = new Node(element, head);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            head = node;
        }

        size++;
    }

    @Override
    public void addLast(T element) {
        Node node = new Node(element, null);

        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    @Override
    public T pollFirst() {
        T element;

        if (head == null) {
            element = null;
        } else {

            element = head.element;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node next = head.next;
                head.next = null;
                head = next;
            }
            size--;
        }

        return element;
    }

    @Override
    public T pollLast() {
        T element;

        if (tail == null) {
            element = null;
        } else {
            element = tail.element;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node current = head;
                Node previous = head;
                while (current.next != null) {
                    previous = current;
                    current = current.next;
                }
                tail = previous;
                tail.next = null;
            }
            size--;
        }

        return element;
    }

    @Override
    public T peekFirst() {
        T element;
        if (head == null) {
            element = null;
        } else {
            element = head.element;
        }
        return element;
    }

    @Override
    public T peekLast() {
        T element;
        if (tail == null) {
            element = null;
        } else {
            element = tail.element;
        }
        return element;
    }

    @Override
    public void clear() {
        Node current = head;
        while (current.next != null) {
            Node next = current.next;
            current.next = null; // break links
            current = next;
        }

        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(T element) {
        boolean contains = false;

        Node current = head;
        while (current != null) {
            if (current.element.equals(element)) {
                contains = true;
                break;
            }
            current = current.next;
        }

        return contains;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");

        Node current = head;
        if (current != null) {

            while (current != null) { // O(n)
                joiner.add(current.element.toString()); // O(n)
                current = current.next;
            }
        }
        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {

        T element;
        Node next;

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
