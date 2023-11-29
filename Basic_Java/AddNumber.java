package Basic_Java;
import java.util.*;
public class AddNumber {
    public static int Result(int number){
        int Answer=0;
        while(number>0){
            int num=number%10;
            Answer=Answer+num;
             number=number/10;
        }
        return Answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int size=sc.nextInt();
        int Output=Result(size);
        System.out.println("Output:     "+Output);
    }
}
