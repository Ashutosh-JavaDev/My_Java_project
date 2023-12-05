//Write a Java program to convert all characters in a string to uppercase.
package Practice_java;
import java.util.*;
public class tooUppercase {
    public static String result(String str){
        String str2=str.toUpperCase();
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();
        String answer=result(str);
        System.out.println(answer);

    }
}
