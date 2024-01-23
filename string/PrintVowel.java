import java.util.Scanner;

class vowelPrint {
    void printvowel(String str) {
        String st = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                char newch = ch;
            } else {
                st = st + ch;
            }
        }
    }
}

public class PrintVowel {

}
