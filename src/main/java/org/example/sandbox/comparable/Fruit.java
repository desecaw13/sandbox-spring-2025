package org.example.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit implements Comparable<Fruit> {
    protected String name;
    protected String color;
    protected double weight;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Fruit o) {
        int nameC = this.name.compareTo(o.name);
        if (nameC != 0) {
            return nameC;
        }

        int colorC = this.color.compareTo(o.color);
        if (colorC != 0) {
            return colorC;
        }

        return Double.compare(this.weight, o.weight);
    }

    public static void main(String[] args) {

        Fruit banana = new Fruit("Banana", "Yellow", 120.0);
        Fruit apple = new Fruit("Apple", "Red", 150.0);
        Fruit cherry = new Fruit("Cherry", "Red", 10.0);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(banana);
        fruits.add(apple);
        fruits.add(cherry);

        fruits.forEach(System.out::println);
        System.out.println();

        Collections.sort(fruits);

        fruits.forEach(System.out::println);
    }
}
