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
    }
}
