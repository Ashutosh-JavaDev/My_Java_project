import java.util.Scanner;

class reverse {
    String str;

    void getString() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
    }

    String reverseString() {
        String st="";
        for(int i=str.length()-1;i>=0;i--){
            st=str+st;
        }
        return st;
    }
}

public class stringReverse {
public static void main(String[] args) {
    reverse ob=new reverse();
    ob.getString();
    ob.reverseString();
}
}
