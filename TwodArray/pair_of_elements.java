//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

import java.util.*;
public class pair_of_elements{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the row");
		int row=sc.nextInt();
	
		int arr[]=new int[row];
		System.out.println("Enter the elements in array");
		for(int i=0;i<row;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int c=0;
		System.out.println("Enter the sum of number");
		int input=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=i+1;j<row;j++)
			{
				if((arr[i]+arr[j])==input)
				{
					System.out.println("row [" +i+ "] col [" +j+ "] : "+input);
				}
				if(arr[i]+arr[j]!=input)
				{
					c++;
				}
			}
		}
		if(c>0)
		{
			System.out.println("The value is not their for the calculation");
		}
		
	}
}