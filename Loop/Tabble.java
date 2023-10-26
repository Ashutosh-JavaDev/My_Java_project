package Loop;

import java.util.*;

public class Tabble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number of The Table");
        int s = sc.nextInt();
        System.out.println("Enter the  Starting Value For the Table");
        int f = sc.nextInt();
        System.out.println("Enter the  Last Number of  The Table");
        int e = sc.nextInt();
        System.out.println("Enter the Ending Value For the Table");
        int l = sc.nextInt();
        for (int i = s; i <= e; i++) {
            for (int j = f; j <= l; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }

        }
    }
}
