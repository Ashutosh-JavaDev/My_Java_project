import java.util.Scanner;

class Check {
    void palin(String str) {
       
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
 public static void main(String[] args) {
    Check ob=new Check();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String str = sc.nextLine();
    ob.palin(str);
 }
}
