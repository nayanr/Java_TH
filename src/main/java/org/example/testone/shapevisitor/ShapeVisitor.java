package org.example.testone.shapevisitor;

import org.example.testone.shapes.Circle;
import org.example.testone.shapes.Rectangle;
import org.example.testone.shapes.Triangle;

public interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);

    void visit(Triangle triangle);

}
