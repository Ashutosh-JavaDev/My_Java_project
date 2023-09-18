import java.util.*;

class Calculate {
    float a, b, c;

    public float sum() {
        c = a + b;
        return c;
    }

    public float sub() {
        c = a - b;
        return c;
    }

    public float mul() {
        c = a * b;
        return c;
    }

    public float div() {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println("Error: Division by zero");
        }
        return c;
    }

    public void initialization() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of First Number");
        a = sc.nextFloat();
        System.out.println("Enter the value of Second Number");
        b = sc.nextFloat();
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate krishna = new Calculate();
        krishna.initialization();
        System.out.println("Press Button:\n+\n-\n*\n/\nfor your needed output");
        char press = sc.next().charAt(0);
        switch (press) {
            case '+':
                System.out.println(krishna.sum());
                break;
            case '-':
                System.out.println(krishna.sub());
                break;
            case '*':
                System.out.println(krishna.mul());
                break;
            case '/':
                System.out.println(krishna.div());
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
}
