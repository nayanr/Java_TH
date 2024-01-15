package org.example.testone;

import org.example.testone.shapes.Circle;
import org.example.testone.shapes.Rectangle;
import org.example.testone.shapes.Shape;
import org.example.testone.shapes.Triangle;
import org.example.testone.shapevisitor.AreaVisitor;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {

    private static final Logger logger = Logger.getLogger(Test1.class.getSimpleName());

    public static void main(String[] args) {

        AreaVisitor areaVisitor = new AreaVisitor();

        Rectangle rectangle = new Rectangle(10, 15);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 10, 10);

        List<Shape> shapeList = Arrays.asList(rectangle, circle, triangle);

        for (Shape shape : shapeList) {
            shape.accept(areaVisitor);
            double area = areaVisitor.getArea();
            logger.log(Level.INFO,String.format("Area of shape -> %s is  %.4f%n", shape.getClass().getSimpleName(), area));
        }

    }
}
