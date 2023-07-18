//WAP to print sum and average of given series

import java.util.*;

public class Sumandaverage{
	public static void main(String[] args){
		
		int i,n;
		float sum=0,average=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length of the series ");
		n=sc.nextInt();
		
		sc.close();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+(float)i;
			average=((float)sum/n*100);
		}
		   System.out.println("the sum of the given series is :"+sum);
		   System.out.println("the sum of the given series is :"+average);
	}
}
		