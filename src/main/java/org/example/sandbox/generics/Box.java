package org.example.sandbox.generics;

public class Box<T> {
    private T contents;

    public Box() {
    }

    public Box(T contents) {
        this.contents = contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append(contents);
        sb.append('}');
        return sb.toString();
    }
}
