package finalexam.task1;

import java.util.Scanner;

public class Circle implements Drawable {

    private double radius;
    private final static double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
        System.out.println("Area of the circle: " + calculateArea());
    }

    private double calculateArea() {
        return PI * radius * radius;
    }
}
