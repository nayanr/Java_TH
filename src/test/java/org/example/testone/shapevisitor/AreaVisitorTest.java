package org.example.testone.shapevisitor;


import org.example.testone.shapes.Circle;
import org.example.testone.shapes.Rectangle;
import org.example.testone.shapes.Triangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class AreaVisitorTest {

    @Test
    public void getArea() {
        AreaVisitor mockVisitor = Mockito.mock(AreaVisitor.class);

        Mockito.when(mockVisitor.getArea()).thenReturn(10.0).thenReturn(20.0).thenReturn(30.0);

        Rectangle rectangle = new Rectangle(10, 15);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 10, 10);

        rectangle.accept(mockVisitor);
        assertEquals(10.0,mockVisitor.getArea(),0.1);
        circle.accept(mockVisitor);
        assertEquals(20.0,mockVisitor.getArea(),0.1);
        triangle.accept(mockVisitor);
        assertEquals(30.0,mockVisitor.getArea(),0.1);


    }
}