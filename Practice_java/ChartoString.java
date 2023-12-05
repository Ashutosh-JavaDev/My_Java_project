//Write a Java program to create a character array containing a string.
package Practice_java;
import java.util.*;
public class ChartoString {
    public static String result(char chr[],int size){
        String answer="";
        for(int i=0;i<size;i++){
            answer=answer+chr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of character you want to add in a sentence");
        int size=sc.nextInt();
        sc.nextLine();
        char ch[]=new char[size];
        for(int i=0;i<size;i++){
            ch[i]=sc.next().charAt(0);
        }
        String output=result(ch, size);
        System.out.println(output);
    }
}
