package org.example.sandbox.stream;

import java.util.Objects;

public class Widget {
    private double length;
    private double width;
    private double height;

    public Widget() {
    }

    public Widget(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static WidgetBuilder buildWidget() {
        return new WidgetBuilder();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Widget{");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Widget widget)) return false;
        return Double.compare(length, widget.length) == 0 && Double.compare(width, widget.width) == 0 && Double.compare(height, widget.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }


    public static class WidgetBuilder {
        private double length;
        private double width;
        private double height;

        public WidgetBuilder withLength(double length) {
            this.length = length;
            return this;
        }

        public WidgetBuilder withWidth(double width) {
            this.width = width;
            return this;
        }

        public WidgetBuilder withHeight(double height) {
            this.height = height;
            return this;
        }

        public Widget build() {
            return new Widget(length, width, height);
        }
    }
}
