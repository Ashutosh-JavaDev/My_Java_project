//WAP tp create a passwqord page for the user
package Practice_java;

import java.util.*;

public class Password {
    public static boolean ComparePassword(String str1) {
        boolean result=true;
        if (str1.length() >= 8) {
            char firstchar = str1.charAt(0);
            if (firstchar >= 'A' && firstchar <= 'Z') {
                System.out.println("Password is Valid");
            } else {
                System.out.println("Password must start with Alphabet letter");
            }
        } else {
            System.out.println("Password must contains more than that 8 letter");
        }
        return result;
    }

    public static void compare(String str1, String str2) {
        ComparePassword(str1);
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
        ComparePassword(str1);
        if(ComparePassword(str1)==true){
            System.out.println("Confirm Password");
            String str2=sc.nextLine();
            compare(str1, str2);
        }
    }
}
