package Practice_java;
import java.util.*;
public class Replace {
    public static String replace(String str1,String str2, String str3){
     String newString=str1.replace(str2,str3);   
     return newString;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Original String");
        String str1=sc.nextLine();
        System.out.println("Choose the word from the sentence , you want to replace");
        String str2=sc.nextLine();
        System.out.println("Enter the new word you want to place there");
        String str3=sc.nextLine();
        String output=replace(str1, str2, str3);
        System.out.println(output);
    }
}
