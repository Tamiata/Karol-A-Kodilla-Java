package com.kodilla.testing.shape;

import java.util.Objects;

public class Rectangle implements Shape {

    private double lenght;
    private double width;

    public void Shape (double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    public String getShapeName() {
        return "Rectangle";
    }

    public double getField() {
        return lenght * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.lenght, lenght) == 0 && Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, width);
    }
}
