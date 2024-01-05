import java.util.Scanner;

class wordReverse {
    String str, st = "", revSt = "";
    char ch;

    void wordRev() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                st = st + str.charAt(i);
            } else {
                revSt += st + " ";
                st="";
            }
        }
        revSt+=st+"";
        System.out.println(revSt.trim());

    }
}

public class WordReverse {
    public static void main(String[] args) {
        wordReverse ob = new wordReverse();
        ob.wordRev();
    }
}
