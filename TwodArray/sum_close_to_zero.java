//Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.  
import java.util.*;
public class sum_close_to_zero{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the positive and negative array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int p=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		System.out.println("The array after sort");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
		int c=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==0)
				{
					c++;
					System.out.println(arr[i] + "+" +arr[j]+ "=" +0);
				}
				else{
					p++;
				}
			}
		}
	
	 if(c>0)
		{
			System.out.println("The total value that calculate the sum 0 : "+c);
		}
		else if(p>0)
		{
			System.out.println("Their is no value, that calculate the sum  0");
		}
	
	}
}