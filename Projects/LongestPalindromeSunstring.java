import java.util.Scanner;

public class LongestPalindromeSunstring {
    public static String MaximumString(String str[], int size) {
        String maximum = "";
        String st = "";
        int currentMax = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                char ch = str[j].charAt(j);
                st += ch;
                if (str[j].equalsIgnoreCase(st)) {
                    currentMax = str[j].length();
                    if (currentMax > max) {
                        max = currentMax;
                        maximum = str[j];
                    }
                    currentMax=0;
                }
            }
        }
        return maximum;
    }
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the String Array");
        int size=sc.nextInt();
        sc.nextLine();
        String str[]=new String[size];
        System.out.println("Enter the Values in the String Array");
        for(int i=0;i<size;i++){
            str[i]=sc.nextLine();
        }
        String res=MaximumString(str, size);
        System.out.print("Maximum palindrome Strng: "+res);
    }
}
