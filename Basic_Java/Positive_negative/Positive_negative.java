// Write a java program to check whether a given number is positive or negative.

import java.util.*;

public class Positive_negative{
	AC
	public static void main(String[] args){
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your given number");
		num=sc.nextInt();
		
		sc.close();
		
		if(num==0)
		{
			System.out.println("the number is zero");
		}
		else  if(num>0)
		{
			System.out.println("the number is positive");
		}
		else
		{
			System.out.println("the number is negative");
		}
	}
}
	