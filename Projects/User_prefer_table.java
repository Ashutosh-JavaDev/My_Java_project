import java.util.*;

public class User_prefer_table {
    public static void No_of_table(int row, int col, int m, int n) {
        for (int i = row; i <= col; i++) {
            System.out.println("Table : " + i);
            for (int j = m; j <= n; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Add a blank line after each table
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value from the table you want to check");
        int row = sc.nextInt();
        System.out.println("Enter the value till the table will execute");
        int col = sc.nextInt();
        System.out.println("Enter the value from which the table's value will start");
        int m = sc.nextInt();
        System.out.println("Enter the value till which the table's value will execute");
        int n = sc.nextInt();
        No_of_table(row, col, m, n);
    }
}
