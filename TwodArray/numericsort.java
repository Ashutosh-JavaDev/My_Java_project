// Write a Java program to sort a numeric array
import java.util.*;
public class numericsort{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		
			arr[i]=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		System.out.println("The array after sorting");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}