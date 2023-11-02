import java.util.*;

public class index {
    public static char position(String str) {

        char ch=str.charAt(3);
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.nextLine();
        char out=position(st);
        System.out.println("Output: "+out);
    }
}