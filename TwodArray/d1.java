// Write a Java program to remove duplicate elements from a given array and return the updated array length

import java.util.*;
public class d1{
	public  static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new  int  [size];
		System.out.println("Enter the size of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int  c=0;
			for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j]&& i!=j)
				{
					System.out.println("duplicate number: "+arr[i]);
					c++;
				}
				
			}
		}
	for(int i=0;i<size-c;i++)
	{
		System.out.println(":"+i);
	}
	}
	
}