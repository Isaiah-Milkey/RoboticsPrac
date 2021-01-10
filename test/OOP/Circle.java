package test.OOP;

import java.util.Scanner;

public class Circle {

    // instance variables
    private double radius;

    // Main
    public static void main(String[] args) {

        // Prints starting question
        System.out.println("Please enter a number for the radius :)");

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());

    }

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Class methods

    public double getCircumference() {
        return this.radius * 2 * Math.PI;
    }

    public double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }

}
