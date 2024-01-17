import java.util.Scanner;

class vowelCheck {
    void disp(String str) {
        System.out.println("Deleted Vowel");
        String str1 = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                char ch = str.charAt(i);
                System.out.print(ch + " ");
            } else {
                str1 += str.charAt(i);
            }
        }
        System.out.println();
        System.out.println("New String: " + str1);
    }
}

public class deleteAllVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vowelCheck ob = new vowelCheck();
        System.out.println("Pass String");
        ob.disp(sc.nextLine());

    }
}
