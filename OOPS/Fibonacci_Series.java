import java.util.*;

class Fibonacci {
    int num;

    public void series() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " "); // Print the first two Fibonacci numbers
        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(); // Add a newline after printing the series
    }
}

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        System.out.println("Enter the number of Fibonacci numbers to generate:");
        int n = sc.nextInt();
        fib.num = n;
        fib.series();
    }
}
