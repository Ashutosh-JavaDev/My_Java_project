//WAP to print sum of n number of even number

import java.util.*;
public class Evennumbersum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of even number wants to add");
		int n=sc.nextInt();
		
		int sum=0;		 
		
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
			sum=sum+i;
			}
		}
		System.out.println("the sum of given value is:"+sum);
	}
}
