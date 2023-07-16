//Check if two array is common or no

import java.util.*;
public class checkiftwoarrayiscommon{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int [size];
		List<Integer>differenceposition=new ArrayList<>();
		int c=0;
		
		System.out.println("Enter the elements of first array");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				differenceposition.add(i);
			}
		}
	if(differenceposition.isEmpty())
	{
		System.out.println("Both array are identical");
	}
	else{
		System.out.println("Difference position of non common array");
		for(int position:differenceposition)
		{
			System.out.println("Position : " +position+ "-> arr1:" +arr1[position]+"arr2 :"+arr2[position]);
		}
	}
	}
	
}