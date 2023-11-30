package Practice_java;
import java.util.*;
public class Minute_into_second {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Minute");
        float minute=sc.nextFloat();
        float time=(float)minute*60;
        System.out.println(minute+" Minute = "+time+" Second ");
    }
}
