//Write a Java program to trim leading or trailing whitespace from a given string.
package Practice_java;
import java.util.*;
public class TrinSpaces {
    public static String result(String str){
        String str2=str.trim();
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence, with taking some space from left and right");
        String str1=sc.nextLine();
        String answer=result(str1);
        System.out.println(answer);

    }
}
