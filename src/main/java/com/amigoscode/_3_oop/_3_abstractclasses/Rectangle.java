package com.amigoscode._3_oop._3_abstractclasses;

/**
 * Exercise: Abstract Classes - Rectangle
 * <p>
 * Implement a concrete Rectangle class that extends the abstract Shape.
 * You must implement all abstract methods declared in Shape.
 * <p>
 * Key concepts:
 * - Extending an abstract class
 * - Implementing abstract methods
 * - Working with multiple fields
 */

//  1 - Make this class extend Shape.
public class Rectangle extends Shape {

    //  2 - Declare two private fields:
    //   - width (double)
    //   - height (double)
    private final double width;
    private final double height;

    //  3 - Create a constructor that takes width and height.
    //   Validate that both are > 0, throwing IllegalArgumentException if not.
    //   Assign the fields.
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Width and Height should be positive");
        this.width = width;
        this.height = height;
    }

    //  4 - Implement the area() method from Shape.
    //   Formula: width * height
    //   Use the @Override annotation.
    @Override
    public double area() {
        return width * height;
    }

    //  5 - Implement the perimeter() method from Shape.
    //   Formula: 2 * (width + height)
    //   Use the @Override annotation.
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        Rectangle rect = new Rectangle(4.0, 6.0);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        rect.describe();   // inherited concrete method from Shape
        System.out.println(rect);
    }
}
