import java.util.*;

public class pos {
    public static char position(String str,int posit) {

        char ch=str.charAt(posit);
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.nextLine();
        System.out.println("Enter the Index Position");
        int posit=sc.nextInt();
        char out=position(st,posit);
        System.out.println("Output: "+out);
    }
}