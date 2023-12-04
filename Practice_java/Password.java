package Practice_java;

import java.util.*;

public class Password {
    public static boolean ComparePassword(String str1) {
        boolean result = true;
        if (str1.length() <= 8) {
            System.out.println("Password must contain at least 8 characters");
            result = false;
        } else {
            char firstchar = str1.charAt(0);
            if (!(firstchar >= 'A' && firstchar <= 'Z')) {
                System.out.println("Password must start with an alphabet letter");
                result = false;
            } else {
                System.out.println("Password is Valid");
            }
        }
        return result;
    }

    public static void compare(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Password is Set");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("New Password");
        String str1 = sc.nextLine();
        // ComparePassword(str1);
        if (ComparePassword(str1)) {
            System.out.println("Confirm Password");
            String str2 = sc.nextLine();
            compare(str1, str2);
        }
    }
}
