package org.example.testone.shapes;

import org.example.testone.shapevisitor.ShapeVisitor;

public class Rectangle implements Shape {

    private double length;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    private double breadth;

    @Override
    public void accept(final ShapeVisitor visitor) {
        visitor.visit(this);

    }
}
