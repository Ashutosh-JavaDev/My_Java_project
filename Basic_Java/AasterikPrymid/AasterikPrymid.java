//WAP to print prymid of asterik

import java.util.*;

public class AasterikPrymid{
	public static void main(String[] args){
		
		
		int num,row,space,p,n;
		
		Scanner sc=new Scanner (System.in);
		
		/*System.out.println("enter the symbol want to print ");
		sym=sc.nextChar();*/
		
		System.out.println("enter the row want to print ");
		num=sc.nextInt();
		
		
	n=num;
	
	for(row=1;row<=num;row++)
	{
		for(space=1;space<=n;space++)
		{
			System.out.println(" ");
	    }
		n--;
		for(p=1;p<=row;p++)
			System.out.println("* ");
		
		System.out.println("\n");
		/*num=n;
		//sc.close();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=num;j++)
			{
				System.out.println(" ");
			}
			num--;
			for(p=1;p<=i;p++)
			
				System.out.println("* ");
				//System.out.println("\n");*/
			
		
		}	
	}
}
				