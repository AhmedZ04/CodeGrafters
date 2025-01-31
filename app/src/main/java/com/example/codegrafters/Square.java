package com.example.codegrafters;

public class Square extends Shape {
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getArea() {
        return sideLength * sideLength;
    }

    public int getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public String toString() {
        return "Square at (" + getX() + ", " + getY() + ") with side length " + sideLength;
    }
}
