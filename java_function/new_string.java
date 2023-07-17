package  java_function;
import java.util.*;
public class new_string {
   public static String replace(String n) {
      Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string want to replace");
    String a=sc.nextLine();
    System.out.println("Enter the string with the string want to replace");
    String b=sc.nextLine();
    String re=n.replace(a,b);
    return re;
      
   }
   public static void main(String[] args) {
      Scanner sc=new  Scanner(System.in);

      System.out.println("Enter the string");
      String c=sc.nextLine();
      String fe=replace(c);
    System.out.println("The string after replace is  : "+fe);

   }
}
