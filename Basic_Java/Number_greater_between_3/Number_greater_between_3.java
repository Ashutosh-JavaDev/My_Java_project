//Take three numbers from the user and print the greatest number.

import java.util.*;

public class Number_greater_between_3{
	
	public static void main(String[] args){
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your first number number");
		a=sc.nextInt();
		
		System.out.println("enter your second number number");
		b=sc.nextInt();
		
		System.out.println("enter your third number number");
		c=sc.nextInt();
		
		sc.close();
		
		 if(a>b && a>c)
		{
			System.out.println("first number is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second number is greater");
		}
		else
		{
			System.out.println("third number is greater");
		}
	}
}
		
		