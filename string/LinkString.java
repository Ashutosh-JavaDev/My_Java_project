import java.util.*;

public class LinkString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String");
        String str2 = sc.nextLine();
        merge(str1, str2);
    }

    public static void merge(String str1, String str2) {
        StringBuilder str3 = new StringBuilder();
        str3.append(str1).append(" ").append(str2);
        System.out.println("Merge string is: " + str3.toString() + " ");
    }
}
