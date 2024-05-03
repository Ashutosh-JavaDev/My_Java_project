import java.util.Scanner;

class RemoveDuplicates {
    void check(String str) {
        int count = 0;
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (st.indexOf(ch) == -1) { // Check if the character is not already in st
                st += ch;
            } else {
                count++; // Increment count for duplicates
            }
        }
        System.out.println(st);
        System.out.println("Total Duplicate: " + count);
    }
}

public class remDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveDuplicates ob = new RemoveDuplicates();
        System.out.println("Enter the String");
        String str = sc.nextLine();
        ob.check(str);
    }
}
