//Write a Java program to reverse an array of integer values.

import java.util.*;
public class reverse_array{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("EEnter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The value after reverse");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}