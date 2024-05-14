import java.util.Scanner;

class Palindrome {
    int num;

    public void result() {
        int n = num;
        int rev = 0;
        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d; // Fix the bug here: change 1 to d
            num = num / 10;
        }
        if (rev == n) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}

public class Array_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        alin ram = new alin();
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        ram.num = num;
        ram.result();
    }
}
