//Write a Java program to check if an array of integers contains two specified elements 65 and 77

import java.util.*;
public class integercheck{
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
		
		boolean contains65=false;
		boolean contains77=false;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==65)
			{
				contains65=true;
			}
			if(arr[i]==77)
			{
				contains77=true;
			}
		}
		if(contains65&&contains77)
		{
			System.out.println(":The array contains 65 and 77");
			
		}
		else{
			System.out.println("The array doesn't contains 65 & 77");
		}
		
	}
}