// Write a Java program to compare two strings lexicographically.
package Basic_Java.BufferInput;
import java.io.*;
public class CompareString {
    public static void compare(String str1,String str2){
        int Result=str1.compareTo(str2);
        if(Result>0){
        System.out.println("String 1 is Greater");
        }

        else if(Result<0){
            System.out.println("String 2 is Greater");
        }
        else{
            System.out.println("Both Strings are Equal");
        }
    }
    public static void main(String[]args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(read);
        System.out.println("Enter The String One");
        String Line1=sc.readLine();
        System.out.println("Enter the Second String");
        String Line2=sc.readLine();
       compare(Line1, Line2);
    }
}
