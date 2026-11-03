package com.amigoscode._3_oop._4_polymorphism;

import com.amigoscode._3_oop._3_abstractclasses.Circle;
import com.amigoscode._3_oop._3_abstractclasses.Rectangle;
import com.amigoscode._3_oop._3_abstractclasses.Shape;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Polymorphism - Shape Calculator
 * <p>
 * Use polymorphism to write methods that work with any Shape.
 * Because Circle and Rectangle both extend Shape, a single method
 * can handle both — and any future Shape subclass — without modification.
 * <p>
 * Key concepts:
 * - Methods that accept a supertype parameter
 * - Polymorphic collections (List<Shape>)
 * - instanceof with pattern matching (Java 16+)
 * - Open/closed principle in practice
 * <p>
 * Prerequisites: Complete Shape.java, Circle.java, and Rectangle.java first.
 */
public class ShapeCalculator {

    //  1 - Create a method: void printShapeArea(Shape shape)
    //   Print: "The <className> has an area of <area>"
    //   Use shape.getClass().getSimpleName() to get the class name.
    //   Use String.format("%.2f", shape.area()) for formatting.
    public void printShapeArea(Shape shape) {
        System.out.printf("The %s has an area of %.2f%n", shape.getClass().getSimpleName(), shape.area());
    }

    //  2 - Create a method: double totalArea(List<Shape> shapes)
    //   Iterate over all shapes and return the sum of their areas.
    public double totalArea(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    //  3 - Create a method: Shape largestShape(List<Shape> shapes)
    //   Return the shape with the largest area.
    //   If the list is empty, return null.
    public Shape largestShape(List<Shape> shapes) {
        if (shapes == null || shapes.isEmpty()) return null;
        Shape largestShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.area() > largestShape.area()) {
                largestShape = shape;
            }
        }
        return largestShape;
    }

    //  4 - Create a method: String describeShape(Shape shape)
    //   Use instanceof with pattern matching (Java 16+) to return
    //   specific descriptions:
    //   - If shape is a Circle c: return "Circle with radius info"
    //     (just return "Circle detected with area: " + c.area())
    //   - If shape is a Rectangle r: return "Rectangle detected with area: " + r.area()
    //   - Otherwise: return "Unknown shape with area: " + shape.area()
    public String describeShape(Shape shape) {
        if (shape instanceof Circle c) {
            return "Circle detected with area: " + c.area();
        }
        if (shape instanceof Rectangle r) {
            return "Rectangle detected with area: " + r.area();
        }
        return "Unknown shape with area: " + shape.area();
    }

    //  5 - Create a method: String formatSummary(List<Shape> shapes)
    //   Return a formatted summary string like:
    //   "Summary: <N> shapes, total area: <totalArea>, largest area: <largestArea>"
    //   Use the totalArea() and largestShape() methods you already wrote.
    public String formatSummary(List<Shape> shapes) {
        return String.format("Summary: %d shapes, total area: %.2f, largest area: %.2f", shapes.size(), totalArea(shapes), largestShape(shapes).area());
    }

    //  6 - In main, create a List<Shape> with at least two Circles
    //   and two Rectangles. Call all the methods above and print results.
    //   This demonstrates polymorphism: the same method handles
    //   different shape types seamlessly.
    static void main(String[] args) {
        // Complete 6 here.
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        List<Shape> shapes = Arrays.asList(
                new Circle(5.78),
                new Rectangle(2.7, 4.3),
                new Circle(28.57),
                new Rectangle(37.65, 82.37)
        );
        for (Shape shape : shapes) {
            shapeCalculator.printShapeArea(shape);
            System.out.println(shapeCalculator.describeShape(shape));
            System.out.println();
        }

        System.out.println("Total Area: " + shapeCalculator.totalArea(shapes));
        System.out.println();
        System.out.println("Largest Shape: " + shapeCalculator.largestShape(shapes));
        System.out.println();
        System.out.println(shapeCalculator.formatSummary(shapes));
    }
}
