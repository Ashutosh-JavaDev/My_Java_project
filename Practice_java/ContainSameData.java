//Write a Java program to check whether two String objects contain the same data.
package Practice_java;
import java.util.*;
public class ContainSameData {
    public static void result(String str1,String str2){
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Both are equals");
        }
        else{
            System.out.println("String is not equals");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence One");
        String str1=sc.nextLine();
        System.out.println("Enter the Sentence two");
        String str2=sc.nextLine();
        result(str1, str2);
    }
}
