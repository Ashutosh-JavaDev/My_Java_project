//WAP to print sum of ten number

import java.util.*;

public class Tennumbersum{
	public static void main(String[] args){
		
		int a[10],i,sum=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value of 10 number ");
		a=sc.nextInt();
		
		sc.close();
		
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		for (i=0;i<10;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
		