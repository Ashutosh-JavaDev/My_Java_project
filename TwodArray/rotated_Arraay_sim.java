//Write a Java program to check whether there is a pair with a specified sum in a given sorted and rotated array. 

import java.util.*;
public class rotated_Arraay_sim{
	public static void main(String[]args){
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		
		System.out.println("Enter the array wlements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the rotation value of larray");
		int k=sc.nextInt();
		for(int j=0;j<k;j++)
		{
			int temp=arr[size-1];
			for(int i=size-1;i>0;i--)
			{
				
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		
		System.out.println("The array ofter rotated");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
	int p=0;
		System.out.println("Enter the sum, whose calculating value wants to find");
		int s=sc.nextInt();
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==s)
				{
				System.out.println(arr[i] + "+" +arr[j]+ "=" +s);
				}
			else
				{
					p++;
				}
			}
		}
		if(p>0)
		{
			System.out.println("No calculateing value is in the array");
		}
	}
}