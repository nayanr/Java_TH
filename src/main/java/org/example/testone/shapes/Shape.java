package org.example.testone.shapes;

import org.example.testone.shapevisitor.ShapeVisitor;

public interface Shape {
    void accept(ShapeVisitor visitor);

}

