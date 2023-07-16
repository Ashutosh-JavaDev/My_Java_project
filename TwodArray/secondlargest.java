//Write a Java program to find the second largest element in an array.
import java.util.*;
public class secondlargest{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int sec=arr[0+1];
		int min=arr[0];
		int secMin=arr[0+1];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				sec=max;
				max=arr[i];
			}
			if(arr[i]<min)
			{
				secMin=min;
				min=arr[i];
			}
			
		}
		System.out.println("Max no.   			:"+max);
		System.out.println("Second no.			:"+sec);
		System.out.println("Min no.   			:"+min);
		System.out.println("Second min no.			:"+secMin);
		
	}
}