import java.util.Scanner;

class comparision {
    public static void TwoString(String str1, String str2) {
       int str3=str1.compareTo(str2);
       System.out.println(str3);
    }
}

public class CompareTwoString {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the First String: ");
    String str1=sc.nextLine();
    System.out.println("Enter the Second String: ");
    String str2=sc.nextLine();
    comparision ob=new comparision();
    ob.TwoString(str1, str2);
}
}
