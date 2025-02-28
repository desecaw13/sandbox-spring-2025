package org.example.sandbox.stream;

public class FluentApi {
    public static void main(String[] args) {
        Widget widget = Widget.buildWidget().withLength(10).withWidth(5).withHeight(2).build();
        System.out.println(widget);
    }
}
