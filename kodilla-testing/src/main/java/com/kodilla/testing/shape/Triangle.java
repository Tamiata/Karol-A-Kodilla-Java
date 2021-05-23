package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private double width;
    private double height;

    public Triangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField(){
        return width * height * 0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0 && Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
