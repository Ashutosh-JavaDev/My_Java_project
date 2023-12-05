//Write a Java program to convert all characters in a string to lowercase.
package Practice_java;
import java.util.*;
public class tooLowercase {
    public static String result(String str1){
        String str2=str1.toLowerCase();
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str1=sc.nextLine();
        String answer=result(str1);
        System.out.println(answer);
    }
}
