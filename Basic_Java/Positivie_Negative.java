package Basic_Java;
import java.util.*;
public class Positivie_Negative{
    public static void result(int Number){
        if(Number>0){
            System.out.println("Number is Posetive");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int Number=sc.nextInt();
        result(Number);
    }
}