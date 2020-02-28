package Hyperskill.abstractclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TriangleTest {

    private Triangle triangle = new Triangle(3,4,5);
    private Triangle triangle2 = new Triangle(5,5,6);

    @Test
    void getTrianglePerimeterTest() {
        assertEquals(12.0, triangle.getPerimeter());
    }

    @Test
    void getTriangleAreaTest() {
        assertEquals(6.0, triangle.getArea());
    }

    @Test
    void getTriangleAreaTest2() {
        assertEquals(12.0, triangle2.getArea());
    }
}

class RectangleTest {

    private Rectangle rectangle = new Rectangle(5,10);

    @Test
    void getRectanglePerimeterTest() {
        assertEquals(30.0, rectangle.getPerimeter());
    }

    @Test
    void getRectangleAreaTest() {
        assertEquals(50.0, rectangle.getArea());
    }
}

class CircleTest {

    private Circle circle = new Circle(10);

    @Test
    void getCirclePerimeterTest() {
        assertEquals(62.83185307179586, circle.getPerimeter());
    }

    @Test
    void getCircleAreaTest() {
        assertEquals(314.1592653589793, circle.getArea());
    }
}