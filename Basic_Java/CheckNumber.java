package Basic_Java;
import java.util.*;
public class CheckNumber {
    public static void result(int number){
        if(number>50){
            System.out.println("Number is  Greater then 50");
        }
        else{
            System.out.println("Number is less than 50");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number wants to check");
        int number=sc.nextInt();
        result(number);
    }
}
