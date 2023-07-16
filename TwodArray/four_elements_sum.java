//Write a Java program to find all combinations of four elements of an array whose sum is equal to a given value.
import java.util.*;
public class four_elements_sum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("WEnter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the valid input wants to check");
		int num=sc.nextInt();
		int c=0;
		int p=0;
		for(int i=0;i<size-3;i++)
		{
			for(int j=i+1;j<size-2;j++)
			{
				for(int k=j+1;k<size-1;k++)
				{
					for(int l=k+1;l<size;l++)
					{
						if(arr[l]+arr[k]+arr[j]+arr[i]==num)
						{
							System.out.println(arr[l]+ "+" +arr[k]+ "+" +arr[j]+ "+" +arr[i] + "=" +num);
							c++;
						}
					}
				}
			}
		}
			
			
		
		if(c>0)
		{
			System.out.println("The total counting of sum is : "+c);
		}
		else 
		{
			System.out.println("Their are not a vaild input to print the  total sum of "+num);
		}
		
	}
}