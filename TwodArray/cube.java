// PRINT THE CUBE OF THE TABLE

import java.util.*;
import java.lang.Math;
	
public class cube{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("From where you want to search the cube");
		double n=sc.nextDouble();
	System.out.println("Enter the value till cube has to be print");
		double c=sc.nextDouble();
		System.out.println("Enter the power of the value");
		int b=sc.nextInt();
		
		
		for (double i=n;i<=c;i++)
		{
			double result = Math.pow(i,b);
			System.out.println(i+ " = "+result);
			
		}
	
		
	}
}