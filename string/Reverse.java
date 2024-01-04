import java.util.*;

public class Reverse {
    public static void reverse(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        reverse(str);
        System.out.println();
    }
}
