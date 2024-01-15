package org.example.testone.shapevisitor;

import org.example.testone.shapes.Circle;
import org.example.testone.shapes.Rectangle;
import org.example.testone.shapes.Triangle;

public class AreaVisitor implements ShapeVisitor {

    private double area;

    public double getArea() {
        return this.area;
    }

    @Override
    public void visit(Circle circle) {
        this.area = Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(Rectangle rectangle) {
        this.area = rectangle.getBreadth() * rectangle.getLength();

    }

    @Override
    public void visit(Triangle triangle) {
        double semiPerimeter = (triangle.getSide1() + triangle.getSide2() + triangle.getSide3()) / 2;
        this.area = Math.sqrt(semiPerimeter * (semiPerimeter - triangle.getSide1()) * (semiPerimeter - triangle.getSide2()) * (semiPerimeter - triangle.getSide3()));
    }
}
