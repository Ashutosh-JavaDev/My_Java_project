//Write a Java program to check whether there is a pair with a specified sum in a given sorted and rotated array. 

import java.util.*;
public class cyclically_sum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
				int size=sc.nextInt();
				int arr[]=new int[size];
		System.out.println("nter the elements of the araay");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int c=0;
		int p=0;
		System.out.println("Enter the rotation value");
		int  k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			int temp=arr[size-1];
			for(int j=size-1;j>0;j--)
			{
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		System.out.println("The value after rotation");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the specified number want to find the interger sum");
		int num=sc.nextInt();
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==num)
				{
					System.out.println(arr[i] + "+" +arr[j]+ "=" +num);
					c++;
				}
			}
		}
		//System.out.println();
		if(c>0)
		{
			System.out.println("The total counting value that make the sum of specified number : " +c);
		}
		else{
			System.out.println("Their is not a perfect match for the specifeied sum");
		}
			
		
	}
}