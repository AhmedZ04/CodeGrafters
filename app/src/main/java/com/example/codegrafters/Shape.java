package com.example.codegrafters;

public class Shape {
    int x;
    int y;
    String color = "hot pink";
    public Shape(int y, int x, String color) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
