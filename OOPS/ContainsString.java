import java.util.Scanner;

class containString {
    public static boolean containstring(String str, String st) {
        boolean result = false;
        if (str.contains(st)) {
            result = true;
        }
        return result;
    }
}

public class ContainsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Enter the word want to check");
        String st = sc.nextLine();
        containString ob = new containString();
        boolean res = ob.containstring(str, st);
        System.out.println("Result: " + res);
    }
}
