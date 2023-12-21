import java.util.*;
public class PowerFunction {
    public static int check(int num, int i){
        if(i==num){
            return num;
        }
        else{
            return num*check(num,i+1);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Enter the Term");
        int num=sc.nextInt();
        int ans=check(num,i);
        System.out.println(ans);
    }
}
