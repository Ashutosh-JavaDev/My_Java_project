import java.util.Scanner;

class reverse {
    String str;

    void getString(String str) {
        this.str=str;

    }
    String setString(){
        return str;
    }

    String reverseString() {
        String st = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            st = str.charAt(i) + st;
        }
        return st;
    }
}

public class stringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        reverse ob = new reverse();
        ob.getString(sc.nextLine());
        String result=ob.reverseString();
        System.out.println(result);
    }
}
