import java.util.Scanner;

class subStr {
    void stringCheck(String str) {
        int c;
        // char ch[] = str.toCharArray();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            c=1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    c++;
                    words[j]="0";
                }
            }
            if(c>1 && words[i]!="0"){
                System.out.println(words[i]+" - Duplicates Count:   "+c);
            }
        }
    }
}

public class subStringJava {
    public static void main(String[] args) {
        subStr ob = new subStr();
        ob.stringCheck("hii Every Hii");
    }
}
