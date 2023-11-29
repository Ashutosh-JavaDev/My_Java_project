package Basic_Java;

import java.util.*;

public class Comparision {
    public static void Result(int Number1, int Number2, int Number3) {
        if (Number1 > Number2 && Number1 > Number3) {
            System.out.println(Number1 + " is Greater than " + Number2 + " and " + Number3);
        } else if (Number2 > Number1 && Number2 > Number3) {
            System.out.println(Number2 + " is Greater than " + Number1 + " and " + Number3);
        } else {
            System.out.println(Number3 + " is Greater than " + Number1 + " and " + Number2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1 and Number2 and Number3 Values");
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();
        int Number3 = sc.nextInt();
        Result(Number1, Number2, Number3);
    }
}
