package Practice_java;
import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=sc.nextInt();
        int num=number;
        int rev=0;
        while(number>0){
            int d=number%10;
            rev=rev*10+d;
            number=number/10;
        }
        if(rev==num){
            System.out.println("Number Is Palindrome");
        }
        else{
            System.out.println("Number is Not Palindrome");
        }
    }
}
