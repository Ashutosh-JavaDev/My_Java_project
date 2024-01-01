package Inheritate;

import java.util.Scanner;

class Shape {
    double radius; // Use lowercase for variable names

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius; // Use Math.PI for a more accurate value of pi
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Circle extends Shape { // Renamed the class to follow Java conventions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape ob = new Shape();

        System.out.println("Enter radius of Circle");
        ob.setRadius(sc.nextDouble());

        System.out.println("Circumference of Circle: " + ob.getPerimeter());
        System.out.println("Area of Circle: " + ob.getArea());
    }
}
