//WAP to print sum and average of given series

import java.util.*;

public class Averageandsum{
	public static void main(String[] args){
		
		int i,n,sum=0;
		float average=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length of the series ");
		n=sc.nextInt();
		
		sc.close();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			average=((float)sum/n);
		}
		   System.out.println("the sum of the given series is :"+sum);
		   System.out.println("the average of the given series is :"+average);
	}
}
		