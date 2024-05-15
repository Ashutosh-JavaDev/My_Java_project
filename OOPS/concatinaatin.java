import java.util.Scanner;

class Concation {
    public static String result(String str, String st) {
        String sa = " ";
        sa = str.concat(st);
        return sa;
    }
}

public class concatinaatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter One String: ");
        String str = sc.nextLine();
        System.out.print("Enter Second String: ");
        String newStr = sc.nextLine();
    }
}
