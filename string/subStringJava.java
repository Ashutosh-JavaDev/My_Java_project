import java.util.Scanner;

class subStr {
    void stringCheck(String str) {
        int c = 0;
        char ch[] = str.toCharArray();
        String [] words;
        for (int i = 0; i < str.length(); i++) {
        words =str.split(" ");
        }
        System.out.println(words);
        // System.out.println("Total hi in the String: " + c);
    }
}

public class subStringJava {
    public static void main(String[] args) {
        subStr ob = new subStr();
        ob.stringCheck("Hi Everyone how hi are hi this you his");
    }
}
