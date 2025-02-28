package org.example.sandbox.comparable;

public class Apple extends Fruit {
    protected String variety;

    public Apple(String name, String color, double weight, String variety) {
        super(name, color, weight);
        this.variety = variety;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Apple{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", weight=").append(weight).append('\'');
        sb.append(", variety='").append(variety);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "Red", 150.0, "Gala");
        System.out.println(apple);
    }
}
