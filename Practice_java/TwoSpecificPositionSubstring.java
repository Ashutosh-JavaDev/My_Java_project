// Write a Java program to get a substring of a given string at two specified positions.
package Practice_java;

import java.util.*;

public class TwoSpecificPositionSubstring {
    public static String result(String str1, int str2, int str3) {
        String str4 = str1.substring(str2, str3);
        return str4;
    }
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str1=sc.nextLine();
        System.out.println(("Enter the Value of starting Index"));
        int startingIndex=sc.nextInt();
        System.out.println("ENter the Value of Ending Index");
        int endingIndex=sc.nextInt();
        String Output=result(str1, startingIndex, endingIndex);
        System.out.println(Output);
    }
}
