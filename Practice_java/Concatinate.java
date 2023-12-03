package Practice_java;

import java.util.*;

public class Concatinate {
    public static void result(String str1, String str2) {
        String output = str1 + " " + str2;
        System.out.println(output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two String");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        result(str1, str2);
    }

}
