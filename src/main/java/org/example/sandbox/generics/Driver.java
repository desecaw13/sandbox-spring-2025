package org.example.sandbox.generics;

public class Driver {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(5);
        Box<Double> box2 = new Box<>(6.7);
        Box<String> box3 = new Box<>("word");

        Crate<Box<?>> crate = new Crate<>();

        crate.addBox(box1);
        crate.addBox(box2);
        crate.addBox(box3);

        Crate<Box<Integer>> intCrate = new Crate<>();
        intCrate.addBox(new Box<>(1));
        intCrate.addBox(new Box<>(2));
        intCrate.addBox(new Box<>(3));

        crate.addBox(intCrate);

        Crate<Box<?>> c0 = new Crate<>();
        Crate<Box<?>> c1 = new Crate<>();
        Crate<Box<?>> c2 = new Crate<>();
        Crate<Box<?>> c3 = new Crate<>();
        c3.addBox(new Box<>());
        c2.addBox(c3);
        c1.addBox(c2);
        c0.addBox(c1);
        crate.addBox(c0);

        System.out.println(crate);
    }
}
