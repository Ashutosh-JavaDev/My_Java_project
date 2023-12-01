package Practice_java;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Wants to check");
        int number = sc.nextInt();
        int num = number, rev = 0;
        while (number > 0) {
            int d = number % 10;
            rev = rev + (d * d * d); // Cube each digit and add to rev
            number = number / 10;
        }
        if (rev == num) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is Not armstrong");
        }
    }
}
