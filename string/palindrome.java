import java.util.Scanner;

class ews {
    void palin(String str) {
       
        char ch;
        String sp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            sp+=ch;
        }
        if(sp.equalsIgnoreCase(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}

public class palindrome {
 public static void main(String[] args) {
    ews ob=new ews();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String str = sc.nextLine();
    ob.palin(str);
 }
}
