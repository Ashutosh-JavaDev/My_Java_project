package Practice_java;
import java.util.*;
public class AgetoDays {
    public static int days(int age){
        int output=age*365;
        return output;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        int Output=days(age);
        System.out.println("Your Age is "+age+" and the number of days till your age begin is: "+Output);
    }
}
