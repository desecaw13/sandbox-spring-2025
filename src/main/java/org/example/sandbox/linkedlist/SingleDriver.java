package org.example.sandbox.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();

        System.out.println(linkedList.contains(null));

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        linkedList.addLast("sixth");
        linkedList.addLast("seventh");
        linkedList.addLast("eighth");

        System.out.println(linkedList.contains("first"));
        System.out.println(linkedList.contains("eighth"));
        System.out.println(linkedList.contains("tenth"));
        System.out.println(linkedList.contains(null));

        System.out.println(linkedList);

        System.out.println("Head: " + linkedList.peekFirst());
        System.out.println("Tail: " + linkedList.peekLast());

        System.out.println("Poll First: " + linkedList.pollFirst());
        System.out.println("Poll Last: " + linkedList.pollLast());

        System.out.println("Head: " + linkedList.peekFirst());
        System.out.println("Tail: " + linkedList.peekLast());

        System.out.println(linkedList);

        System.out.println(linkedList.size());

        linkedList.clear();

        System.out.println(linkedList.size());

    }
}
