package com.example.codegrafters;

public class Circle extends Shape{
    int radius;
    public Circle(int y, int x, int radius) {
        super(y, x);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
