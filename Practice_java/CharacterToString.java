//Write a Java program to create a String object with a character array.
package Practice_java;

import java.util.*;

public class CharacterToString {
    public static String result(char ch[], int size) {
        String answer = "";
        for (int i = 0; i < size; i++) {
            answer = answer + "" + ch[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minimum number of letters you want to enter in your sentence");
        int size = sc.nextInt();
        char ch[]=new char[size];
        sc.nextLine();
        System.out.println("Enter the character");
        for(int i=0;i<size;i++){
            ch[i]=sc.next().charAt(0);
        }
        String Output=result(ch, size);
        System.out.println("Output: "+Output);
    }
}
