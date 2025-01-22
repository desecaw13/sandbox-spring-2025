package org.example.sandbox.hello;

public class Hello {
    public static void main(String[] args) {
        UselessThing<String> it = s -> s;

        System.out.println(it.call("Hellow"));
    }
}

@FunctionalInterface
interface UselessThing<T> {
    T call(T input);
}
