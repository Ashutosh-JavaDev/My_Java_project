import java.util.Scanner;

class Concation {
    public static String result(String str, String st) {
        // String sa = " ";
        // sa = str.concat(" "+st);
        // return sa;
        String sa = " ";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            str += ch;
        }
        return str;

    }
}

public class concatinaatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter One String: ");
        String str = sc.nextLine();
        System.out.print("Enter Second String: ");
        String newStr = sc.nextLine();
        Concation ob = new Concation();
        String res = ob.result(str, newStr);
        System.out.print("New String: " + res);
        System.out.println();
    }
}
