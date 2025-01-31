package com.example.codegrafters;

public class Diamond extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Diamond(int x, int y, double diagonal1, double diagonal2) {
        super(x, y);  // Call the constructor of Shape
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}
