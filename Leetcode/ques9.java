import java.util.*;

public class ques9 {
    public static boolean isPalindrome(int num, int original, int reversed) {
        if (num == 0) {
            return original == reversed;
        } else {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            return isPalindrome(num / 10, original, reversed);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        
        if (a < 1) {
            System.out.println("Please enter a valid positive number.");
        } else {
            if (isPalindrome(a, a, 0)) {
                System.out.println(a + " is a palindrome.");
            } else {
                System.out.println(a + " is not a palindrome.");
            }
        }
    }
}
