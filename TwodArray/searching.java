// Write a Java program to test if an array contains a specific value.
import java.util.*;
public class searching{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the array elewments");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number wants to search");
		int num=sc.nextInt();
		int c=0;
		int index=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==num)
			{
				c++;
				index=i;
				System.out.println(index+ " position "); 
			}
			
		}
		if(c>0)
		{
			System.out.println("The number is found  " +c+ " times");
		}
		else{
			System.out.println("The number is not in the array");
		}
	}
}