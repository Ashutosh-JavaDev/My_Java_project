//WAP to print harmonic series

import java.util.*;

public class Harmonicseries{
	public static void main(String[] args){
		
		int i,n;
		float sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length of the series ");
		
		n=sc.nextInt();
		
		sc.close();
		
		for(i=1;i<=n;i++)

		{
			sum=sum+(float)1/i;
		}
		System.out.println("the sum of the given series is :"+sum);
	}
}