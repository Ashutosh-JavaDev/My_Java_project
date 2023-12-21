import java.util.*;
public class Reverse {
    public static void reverse(int num){
        if(num<10){
          System.out.println(num);
          return;
        }
        else{
            int div=num%10;
            System.out.println(div);
            reverse(num/10);
        }

    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter digit");
        int num=sc.nextInt();
        reverse(num);
    }
}
