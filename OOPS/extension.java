import java.util.Scanner;

public class extension {
    public void entens() {
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
