import java.util.*;

public class Diamond1 {

    public static void diamondpattern(int n, int z) {
        for (int l = 1; l <= z; l++) {
            for (int c = 1; c <= n; c++) {
                for (int i = 1; i <= n; i++) {
                    for (int j = n; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k < i * 2; k++) {
                        if (k == 1 || k == (i * 2 - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print("-");
                        }
                    }
                    System.out.print("  "); // Add extra spaces to separate the diamonds
                }
                System.out.println();
            }

            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k < i * 2; k++) {
                    if (k == 1 || k == (i * 2 - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.print("  "); // Add extra spaces to separate the diamonds
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for each diamond");
        int n = sc.nextInt();
        System.out.println("Enter the number of diamonds to print");
        int z = sc.nextInt();
        diamondpattern(n, z);
    }
}
