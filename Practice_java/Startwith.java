package Practice_java;

import java.util.*;

public class Startwith {
    public static void checkStart(String str1, String str2) {
        if (str1.startsWith(str2)) {
            System.out.println("String Match");
        } else {
            System.out.println("String Not match");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String str1 = sc.nextLine();
        System.out.println("Type the word to check, if the first word start with your input or not");
        String str2=sc.next();
        checkStart(str1, str2);
    }
}
