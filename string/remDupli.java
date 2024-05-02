import java.util.Scanner;

class removeDupli {
    void check(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                char ch=str.charAt(i);
                char sch=str.charAt(j);
                if(ch==sch){
                    count++;
                }
            }

        }
    }
}

public class remDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        removeDupli ob = new removeDupli();
        System.out.println("Enter the String");
        String str = sc.nextLine();
        ob.check(str);
    }
}
