package org.example.sandbox.factory;

import org.example.sandbox.generics.Box;

public class Driver {

    public static void main(String[] args) throws Exception {

        Box<?> box = Factory.getInstance(Box.class);
        System.out.println(box);
    }
}
