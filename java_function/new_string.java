package  java_function;
import java.util.*;
public class new_string {
    // Function to calculate the length of the string

 public static  int  length(String n){
    return n.length();    
 }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String a=sc.nextLine();
    int le=length(a);
    System.out.println("The length is :"+le);
 }
 

}
