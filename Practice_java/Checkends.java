//Write a Java program to check whether a given string ends with another string.
package Practice_java;

import java.util.*;

public class Checkends {
    public static boolean output(String str1, String str3) {
        boolean result = false;
        if (str1.endsWith(str3)) {
            result = true;
        } else {
             result=false;

        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str1=sc.nextLine();
        System.out.println("Enter the word, to check if the sentence ends with this word");
        String str3=sc.nextLine();
        boolean answer=output(str1, str3);
        System.out.println("Answer: "+answer);
    }
}
