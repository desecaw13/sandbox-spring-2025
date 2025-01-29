package org.example.sandbox.inheritance;

public class Zookeeper {

    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        zookeeper.feed(new Lion());
        zookeeper.feed(new Tiger());
    }
}
