//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.*;

public class Weekday{
	
	public static void main(String[] args){
		
		int day;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the number of day");
		day=sc.nextInt();
		
		sc.close();
		
		if(day==1)
		{
			System.out.println("it's  sunday");
		}
		else if(day==2)
		{
			System.out.println("it's monday");
		}
		else if(day==3)
		{
			System.out.println("it's tuesday");
		}
		else if(day ==4)
		{
			System.out.println("it's wednesday");
		}
		else if(day==5)
		{
			System.out.println("it's thursday");
		}
		else if(day==6)
		{
			System.out.println("it's friday");
		}
		else if(day==7)
		{
			System.out.println("it's saturday");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}