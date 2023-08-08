//sum of  digit 
import java.util.*;
public class sum_of_digit{
	public static int sum_of_digit(int num){
		int  sum=0;
		int n=num;
		while(num>0){
			int d=num%10;
			sum=sum+d;
			num=num/10;
		}
		return sum;		
	}
	public  static  void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number wants to  find the sum of their digits");
		int a=sc.nextInt();
		int su=sum_of_digit(a);
		System.out.println("The sum of "+a+" digits is: "+su);
	}
}