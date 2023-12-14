import java.util.*;

public class Factorial {
    public static int fact(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();

        int result = fact(inputNumber);
        System.out.println("Factorial of " + inputNumber + " is: " + result);
    }
}
