import java.util.*;

public class shape_formula {
    // Method to calculate the area and perimeter of a rectangle
    public static void perimeterLengthRectangle(float l, float b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1. to find the area of rectangle\npress 2. to find the perimeter of the rectangle");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                float area = l * b;
                System.out.println("The area of the rectangle is: " + area);
                break;
            case 2:
                float peri = 2 * (l + b);
                System.out.println("The perimeter of the rectangle is: " + peri);
                break;
            default:
                System.out.println("Invalid press");
                break;
        }
    }

    // Method to calculate the area and perimeter of a square
    public static void square(float side) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1: for area of square\npress 2. for perimeter of the square");
        int pr = sc.nextInt();
        switch (pr) {
            case 1:
                float area = side * side;
                System.out.println("The area of square is: " + area);
                break;
            case 2:
                float perimeter = 4 * side;
                System.out.println("The perimeter of the square is: " + perimeter);
                break;
            default:
                System.out.println("Invalid press");
                break;
        }
    }

    // Method to calculate the area and circumference of a circle
    public static void circle(float radius) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1. To find the area of the circle\nPress 2. To find the circumference of the circle");
        int cl = sc.nextInt();
        switch (cl) {
            case 1:
                double area = 3.14 * radius * radius;
                System.out.println("The area of circle is: " + area);
                break;
            case 2:
                double circumference = 2 * 3.14 * radius;
                System.out.println("The circumference of the circle is: " + circumference);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }
    
    // Method to calculate the area and hypotenuse of a triangle
    public static void triangle(float base, float height) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1. To find the area of the triangle\nPress 2. To find the Pythagorean Theorem");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                float area = 0.5f * base * height; // Corrected the formula for triangle area
                System.out.println("The area of the triangle is: " + area);
                break;
            case 2:
                double pythagoras = Math.sqrt(base * base + height * height);
                System.out.println("The Hypotenuse of the Pythagorean Theorem is: " + pythagoras);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1. To check the value for rectangle\nPress 2. To check the value for square\nPress 3. To check the value for circle\nPress 4. To check the value for Triangle");
        int click = sc.nextInt();
        switch (click) {
            case 1:
                System.out.println("Enter the length of the rectangle");
                float l = sc.nextFloat();
                System.out.println("Enter the breadth of the rectangle");
                float b = sc.nextFloat();
                perimeterLengthRectangle(l, b);
                break;
            case 2:
                System.out.println("Enter the side of the square");
                float side = sc.nextFloat();
                square(side);
                break;
            case 3:
                System.out.println("Enter the radius of the circle");
                float radius = sc.nextFloat();
                circle(radius);
                break;
            case 4:
                System.out.println("Enter the base of the triangle");
                float base = sc.nextFloat();
                System.out.println("Enter the height of the triangle");
                float height = sc.nextFloat();
                triangle(base, height);
                break; // Added missing break statement here
            default:
                System.out.println("Press valid key");
                break;
        }
    }
}
