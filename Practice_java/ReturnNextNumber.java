package Practice_java;
import java.util.*;
public class ReturnNextNumber {
    public static int result(int Number){
        int answer=++Number;
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number, after which the +1 want to check");
        int number=sc.nextInt();
        System.out.println("Original Number:    "+number);
        int output=result(number);
        System.out.println("Number after adding +1 Value: "+output);
    }
}
