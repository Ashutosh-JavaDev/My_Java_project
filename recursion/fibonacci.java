import java.util.*;
public class fibonacci {
    public static int fibo(int num,int a,int b){
        if(num<=1){
            return num;
        }
        else{
            int c=a+b;
            System.out.println(c);
            return fibo(num, b, c);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter term");
        int num=sc.nextInt();
        fibo(num, 0, 1);
    }
}
