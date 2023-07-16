//Write a Java program to find the maximum product of two integers in a given array of integers.  

import java.util.*;
public class product_maximun{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("entre the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int sec=arr[0+1];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{//swap
				sec=max;
				max=arr[i];
				
			}
		}
		System.out.println("Max		:"+max);
		System.out.println("Sec Max		:"+sec);
		int m=1;
		m=max*sec;
		System.out.println("The product of two maximun number is  :"+m);
	}
}