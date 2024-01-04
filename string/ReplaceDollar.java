import java.util.Scanner;

class ReplaceD {
    String str;

    void getString(String str) {
        this.str = str;
    }

    void replaced() {
       String st=str.replace(str, "$");
       System.out.println(st);
    }
}

public class ReplaceDollar {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    ReplaceD ob=new ReplaceD();
    ob.getString(sc.nextLine());
    ob.replaced();
    
}
}
