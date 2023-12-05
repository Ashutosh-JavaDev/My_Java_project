//Write a Java program to find the second most frequent character in a given string.
package Practice_java;
import java.util.*;
public class SecondMostOccurence {
    public static void result(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           if(ch>2){
            System.out.println("outcome:    "+ch);
            break;
           }
           else{
            System.out.println("Error");
           }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=sc.nextLine();
        result(str1);
    }
}
