package com.amigoscode._3_oop._3_abstractclasses;

/**
 * Exercise: Abstract Classes - Circle
 * <p>
 * Implement a concrete Circle class that extends the abstract Shape.
 * You must implement all abstract methods declared in Shape.
 * <p>
 * Key concepts:
 * - Extending an abstract class
 * - Implementing abstract methods
 * - Using Math.PI for calculations
 */

//  1 - Make this class extend Shape.
public class Circle extends Shape {

    //  2 - Declare a private field:
    //   - radius (double)
    private final double radius;

    //  3 - Create a constructor that takes a radius.
    //   Validate that radius > 0, throwing IllegalArgumentException if not.
    //   Assign the field.
    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius should be positive");
        this.radius = radius;
    }

    //  4 - Implement the area() method from Shape.
    //   Formula: Math.PI * radius * radius
    //   Use the @Override annotation.
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    //  5 - Implement the perimeter() method from Shape.
    //   Formula: 2 * Math.PI * radius
    //   Use the @Override annotation.
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        Circle circle = new Circle(5.0);
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        circle.describe();   // inherited concrete method from Shape
        System.out.println(circle);
    }
}
