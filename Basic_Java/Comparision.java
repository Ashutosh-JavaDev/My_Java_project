package Basic_Java;

import java.util.*;

public class Comparision {
    public static void Result(int Number1, int Number2) {
        if (Number1 > Number2) {
            System.out.println(Number1 + " is Greater than " + Number2);
        } else {
            System.out.println(Number1 + " is less than " + Number2);

        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number1 and Number2 Values");
        int Number1=sc.nextInt();
        int Number2=sc.nextInt();
        Result(Number1,Number2);
    }
}
