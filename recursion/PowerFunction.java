import java.util.*;
public class PowerFunction {
    public static int check(int num){
        if(num==1){
            return num;
        }
        else{
            System.out.println(num);
            return check(num*num);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Term");
        int num=sc.nextInt();
        int ans=check(num);
        System.out.println(ans);
    }
}
