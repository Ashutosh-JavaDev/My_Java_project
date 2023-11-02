import java.util.*;
public class comparison {
    public static void compare(String str1,String str2){
        int result=str1.compareTo(str2);
        if (result < 0) {
            // str1 comes before str2
        } else if (result > 0) {
            // str1 comes after str2
        } else {
            // str1 and str2 are equal
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String");
        String str1=sc.nextLine();
        System.out.println("Enter the Second String");
        String str2=sc.nextLine();

    }
}
