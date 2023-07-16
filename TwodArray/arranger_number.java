//arrange posetive and neagative in array

import java.util.*;
public class arranger_number{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int c=0;
		int p=0;
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				
				c++;
			}
			else if(arr[i]>0)
			{
				p++;
			}
		}
		int negative[]=new int[c];
		int posetive[]=new int[p];
		int negInd=0;
		int posInd=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				negative[negInd++]=arr[i];
			}
			else if(arr[i]>0)
			{
				posetive[posInd++]=arr[i];
			}
		}
		for(int i=0;i<c;i++)
		{
			System.out.print(negative[i]+" ");
		}
		for(int i=0;i<p;i++)
		{
			System.out.print(posetive[i]+" ");
		}
		System.out.println("The negative number are : "+c);
		System.out.println("The posetive number are : "+p);
	}
}
		