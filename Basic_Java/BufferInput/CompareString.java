// Write a Java program to compare two strings lexicographically.
package Basic_Java.BufferInput;
import java.io.*;
public class CompareString {
    public static void main(String[]args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(read);
        System.out.println("Enter The String One");
        String Line1=sc.readLine();
        System.out.println("Enter the Second String");
        String Line2=sc.readLine();
        int Result=Line1.compareTo(Line2);
        System.out.println("Greater : "+Result);
    }
}
