import java.util.Scanner;

class subStr {
    void stringCheck(String str) {
        int c = 0;
        char ch[] = str.toCharArray();
        String words[] = str.split(" ");
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {

                }
            }
        }
    }
}

public class subStringJava {
    public static void main(String[] args) {
        subStr ob = new subStr();
        ob.stringCheck("Hi Everyone how hi are hi this you his");
    }
}
