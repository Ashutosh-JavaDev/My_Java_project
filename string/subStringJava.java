import java.util.Scanner;

class subStr {
    void stringCheck(String str) {
        int c = 1;
        char ch[] = str.toCharArray();
        String words[] = str.split(" ");
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    c++;
                    words[j]="0";
                }
            }
            if(c>1 && words[i]!="0"){
                System.out.println(words[i]);
            }
        }
        if(c>1){
            System.out.println("Duplicate words:    "+c);
        }
        else{
            System.out.println("No Duplicate Words Found");
        }
    }
}

public class subStringJava {
    public static void main(String[] args) {
        subStr ob = new subStr();
        ob.stringCheck("Hi Everyone how hi how this how are hi this you his");
    }
}
