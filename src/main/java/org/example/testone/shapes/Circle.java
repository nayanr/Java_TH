package org.example.testone.shapes;

import org.example.testone.shapevisitor.ShapeVisitor;


public class Circle implements Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(final ShapeVisitor visitor) {
        visitor.visit(this);

    }
}
