import java.util.Scanner;

class removeDupli {
    void check(String str) {
        int count=0;
        char ch=' ';
        char sch=' ';
        String st=" ";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                 ch=str.charAt(i);
                 sch=str.charAt(j);
                 st+=ch;
                if(ch==sch){
                    count++;
                }
            }

        }
        System.out.print(st);
        System.out.println();
        System.out.println("Total Duplicate: "+count);
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
