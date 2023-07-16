//Write a Java program to remove a specific element from an array
import java.util.*;
 public class remove{
	 public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
		 
		System.out.println("nter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.print("Enter the location want to delete ");
			int loc=sc.nextInt();
			for(int i=loc;i<size-1;i++)
			{
				arr[i]=arr[i+1];
			}
			for(int i=0;i<size;i++)
			{
				System.out.println("The elements after remove" +arr[i]);
			}
	 }
 }