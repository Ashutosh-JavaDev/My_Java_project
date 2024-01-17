import java.util.Scanner;

class Check {
    void palin(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        char ch;
        String sp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            sp+=ch;
        }
        if(sp.equals(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String ids not palindrome");
        }
    }
}

public class Palindrome {

}
