import java.util.Scanner;

class vowelPrint {
    void printvowel(String str) {
        String st = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                char newch = ch;
            } else {
                st = st + ch;
            }
        }
        System.out.println("New String: " + st);
    }
}

public class PrintVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vowelPrint ob = new vowelPrint();
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        ob.printvowel(str);
    }
}
