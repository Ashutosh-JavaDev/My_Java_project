//Write a Java program to count the number of possible triangles from a given unsorted array of positive integers.

import java.util.*;
public class triangle_unsorted{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the posetive elements of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		int c=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==max)
				{
					System.out.println(arr[i]+ "," +arr[j]+ ","+max);
					c++;
				}
			}
		}
		if(c>0)
		{
			System.out.println("The total positive integers form triangle : "+c);
		}
	}
}