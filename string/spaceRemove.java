import java.util.Scanner;

class remSpace {
    void sapceRem(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

public class spaceRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        remSpace ob = new remSpace();
        System.out.println("Enter the String");
        String str = sc.nextLine();
        ob.sapceRem(str);
    }
}
