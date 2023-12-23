import java.util.*;
public class sumOfDigits {
    public static int sumOfdigits(int num){
        int sum=0;
        if(num<10){
            return num;
        }
        else{
            int d=num%10;
            sum=sum+d;
            return sumOfdigits(num/10);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }
}
