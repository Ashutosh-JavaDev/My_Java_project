import java.util.Scanner;

class longword {
    String lingWord(String str) {

        String longst = "";
        String shortst = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                shortst += ch;
            } else {
                if (shortst.length() > max) {
                    max = shortst.length();
                    longst = shortst;
                }
                shortst = " ";
            }
        }
        if (shortst.length() > max) {
            longst = shortst;
        }
        return longst;
    }
}

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        longword ob=new longword();
        System.out.println("Enter String");
        String  str=sc.nextLine();
        String st=ob.lingWord(str);
        System.out.println(st);
    }
}
