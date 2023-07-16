package TwodArray;
import java.util.*;
public class binarysort{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter the array elemtns");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
			//System.out.println();
		}
		System.out.println("Array elements after sorting");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int c=0;
		System.out.println("Enter the number wants to search");
		int n=sc.nextInt();
		int index=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]==n)
			{
				c++;
				index=i;
				System.out.println("position:"+i);
			}
		}
		if(c>0)
		{
			System.out.println("Number is found");
		}
		else{
			System.out.println("No. is not found");
		}
	}
}