import java.util.*;
public class digitReverse {
    public static void reverse(int num){
        if(num<10){
          System.out.println(num);
          return;
        }
        else{
           System.out.println(num%10);
            reverse(num/10);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.print("Enter digit");
        int num=sc.nextInt();
        reverse(num);
    }
}
