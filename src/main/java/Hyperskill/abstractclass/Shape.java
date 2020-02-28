package Hyperskill.abstractclass;

import static java.lang.StrictMath.PI;

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    private double lengthSideOne;
    private double lengthSideTwo;
    private double lengthSideThree;

    public Triangle(double lengthSideOne, double lengthSideTwo, double lengthSideThree) {
        this.lengthSideOne = lengthSideOne;
        this.lengthSideTwo = lengthSideTwo;
        this.lengthSideThree = lengthSideThree;
    }

    double getPerimeter() {
        return lengthSideOne + lengthSideTwo +  lengthSideThree;
    }

    double getArea() {
        //Heron's formula
        double p = (lengthSideOne + lengthSideTwo +  lengthSideThree) / 2;
        return Math.sqrt(p * (p - lengthSideOne) * (p - lengthSideTwo) * (p - lengthSideThree));
    }
}

class Rectangle extends Shape {

    private double lengthSideOne;
    private double lengthSideTwo;

    public Rectangle(double lengthSideOne, double lengthSideTwo) {
        this.lengthSideOne = lengthSideOne;
        this.lengthSideTwo = lengthSideTwo;
    }

    double getPerimeter() {
        return (lengthSideOne + lengthSideTwo) * 2;
    }

    double getArea() {
        return lengthSideOne * lengthSideTwo;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * PI * radius;
    }

    double getArea() {
        return PI * radius * radius;
    }
}