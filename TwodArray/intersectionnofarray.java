//wap to fine the intersection between two array

import java.util.*;
public class intersectionnofarray{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the size of  array");
	int size=sc.nextInt();
	int []arr1=new int[size];
	int []arr2=new int[size];
	int c=0;
	System.out.println("Enter array one elements");
	for(int i=0;i<size;i++)
	{
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter array two elements");
	for(int j=0;j<size;j++)
	{
		arr2[j]=sc.nextInt();
	}	
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
		if(arr1[i]==arr2[j])
		{
			c++;
		}
		}
	}
	if(c>0)
	{
		System.out.println(c);
	}
	
	
	}
}
