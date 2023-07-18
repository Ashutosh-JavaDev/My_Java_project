//WAP to print sum of given factorial number

import java.util.*;

public class Factorialsum{
	public static void main(String[] args){
		
		int i,n,mul=1;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the length of the series ");
		n=sc.nextInt();
		
		sc.close();
		
		for(i=n;i>=1;i--)
		{
			mul=mul*i;
				
		}
		System.out.println("the factorial of given series is :"+mul);
		
	}
}