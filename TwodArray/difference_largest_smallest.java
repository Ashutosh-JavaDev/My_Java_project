// Write a Java program to get the difference between the largest and smallest values in an array of integers.

import java.util.*;
public class difference_largest_smallest{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				arr[i]=min;
			}
		}
		System.out.println("Max no			: "+max);
		System.out.println("Min no.			: "+min);
		int sub=0;
		for(int i=0;i<size;i++)
		{
			sub=(max-min);
		}
		System.out.println("The difference between maximun and minimun  number is : "+sub);
	}
}