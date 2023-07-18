// Write a Java method to compute the sum of digits in an integer.
// // Test Data:

import java.util.*;
public class digit_sum{
	public static int digit_sum(int n){
		int sum=0;
		int r=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int d=digit_sum(a);
		System.out.println("sum of given digit_sum	:"+d);
	}
}
