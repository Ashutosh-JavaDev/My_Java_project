//Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.  

import java.util.*;
public class merge_array{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size1=sc.nextInt();
		System.out.println("Enter the size of the second array");
		int size2=sc.nextInt();
		
		int arr1[]=new int [size1];
		int arr2[]=new int [size2];
		System.out.println("Enter the elements in array 1");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements in array two");
		for(int j=0;j<size2;j++)
		{
			arr2[j]=sc.nextInt();
		}
		int n=(size1+size2);
		int arr3[]=new int[n];
		int i=0,j=0,k=0;
		while(i<size1&&j<size2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
			}
			else{
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<size1)
		{
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<size2)
		{
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		System.out.println("The array after merge");
		for(int m=0;m<n;m++)
		{
			System.out.println(arr3[m]);
		}
	}
}

