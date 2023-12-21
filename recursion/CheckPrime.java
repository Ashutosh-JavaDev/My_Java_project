import java.util.*;

public class CheckPrime {
    public static int check(int num, int i) {
        if (i == num) {
            System.out.println("output " + num);
            return num;
        } else if (num % i == 0) {
            System.out.println("output " + i);
            return 0;  // It's not a prime number, return 0
        } else {
            return check(num, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result = check(num, 2);  // Start checking from 2
        if (result == 0) {
            System.out.println(num + " is not a prime number.");
        } else {
            System.out.println(num + " is a prime number.");
        }
    }
}
