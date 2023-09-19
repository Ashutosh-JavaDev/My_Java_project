import java.util.*;
class factor{
    int num;
    public int result(){
        int fact=1;
        for(int i=1;i<=num;i++){
           fact =fact*i;
        }
        return fact;
    }
}
public class factorial_calculator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    factor Sanatan=new factor();
    System.out.println("Enter number");
    int n=sc.nextInt();
    Sanatan.num=n;
    int output=Sanatan.result();
    System.out.println("Result: "+output);
    }
}
