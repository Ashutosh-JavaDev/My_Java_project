import java.util.Scanner;

class ReplaceD {
    String str;

    void getString(String str) {
        this.str = str;
    }

    void replaced() {
        // String st = "";
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == ' ') {
        //         st += "$";
        //     } else {
        //         st += str.charAt(i);
        //     }
        // }
        // System.out.println(st);
        String replacestr=str.replace(' ', '$');
        System.out.println(replacestr);
    }
}

public class ReplaceDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        ReplaceD ob = new ReplaceD();
        ob.getString(sc.nextLine());
        ob.replaced();

    }
}
