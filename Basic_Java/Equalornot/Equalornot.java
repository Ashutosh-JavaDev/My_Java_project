//Write a java program to accept two integers and check whether they are equal or not. 

import java.util.*;

public class Equalornot{
	
	public static void main(String[] args){
		
		int a,b,num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your first number");
		a=sc.nextInt();
		
		System.out.println("enter your second number");
		b=sc.nextInt();
		
		sc.close();
		
		if(a==b || b==a)
		{
			System.out.println("the given numbers are equal");
		}
		else
		{
			System.out.println("the given number are not equal");
		}
	}
}