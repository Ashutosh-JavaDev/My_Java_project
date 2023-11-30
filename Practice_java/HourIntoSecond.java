package Practice_java;
import java.util.*;
public class HourIntoSecond {
    public static int result(float hour){
        int second=(int)(hour*60*60);
        return second;
    }    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Hour, to convert into Second");
        float hour=sc.nextFloat();
        int output=result(hour);
        System.out.println(hour+" Hour = "+output+" second");
    }
}
