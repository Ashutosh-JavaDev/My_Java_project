//Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers
import java.util.*;
public class even_odd_array{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("nter thre size of the array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		} int c=0;
		int p=0;
		System.out.println("The even number are");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				c++;
			}
			
		}
		System.out.println("The odd number are");
		
		for(int j=0;j<size;j++)
		{
			if(arr[j]%2!=0)
			{
				System.out.println(arr[j]);
				p++;
			}
			
		}
		if(c>0)
		{
			System.out.println("The total counting of even number is :"+c);
		}
		if(p>0)
		{
			System.out.println("The total counting of odd number  is :"+p);
		}
	}
}