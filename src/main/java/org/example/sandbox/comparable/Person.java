package org.example.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int nameC = this.name.compareTo(o.name);
        if (nameC != 0) {
            return nameC;
        }

        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("John", 35);
        Person person4 = new Person("Jane", 40);
        Person person5 = new Person("John", 45);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        people.forEach(System.out::println);
        System.out.println();

        Collections.sort(people);

        people.forEach(System.out::println);
    }
}
