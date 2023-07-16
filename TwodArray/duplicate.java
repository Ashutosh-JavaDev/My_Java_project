//. Write a Java program to find duplicate values in an array of integer values.

import java.util.*;
public class duplicate{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j]&& i!=j)
				{
					System.out.println("duplicate number: "+arr[i]);
				}
				
			}
		}
		
	}
}