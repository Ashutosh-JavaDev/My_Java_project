//Write a Java program to find common elements between two arrays

import java.util.*;
public class common_elements{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[size];
		System.out.println("Enter the elements in first array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements in second array");
		for(int j=0;j<size;j++)
		{
			arr1[j]=sc.nextInt();
		}
		int c=0;
		System.out.println("The common elements are:");
		for(int i=0;i<size;i++)
		{for(int j=0;j<size;j++)
			{
			if(arr[i]==arr1[j])
			{
				System.out.println(arr[i]);
				c++;
			}
			}
		}
		System.out.println("total Common elements are : "+c);
	}
}