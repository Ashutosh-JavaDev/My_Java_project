//common elements in sorted array

import java.util.*;
public class decendingcommon{
	public static void commonelements(int arr1[], int arr2[], int arr3[]){
		int n1=arr1.length;
		int n2=arr2.length;
		int n3=arr3.length;
		
		int i=0;
		int j=0;
		int k=0;
		 boolean foundCommon = false; 
		while(i<n1&&j<n2&&k<n3)
		{
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k])
			{
				System.out.println(arr1[i]);
				i++;j++;k++;
				foundCommon=true;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr3[k])
			{
				j++;
			}
			else if(arr3[k]<arr1[i]){
				k++;
			}
		}
			if(!foundCommon){
				System.out.println("Their are no common array");
			}
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr1[]=new int [size];
		int arr2[]=new int [size];
		int arr3[]=new int[size];
		System.out.println("Enter the elements in array1");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements in array 2");
				for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=sc.nextInt();
		}
		System.out.println("Enter the elements in array 3");
				for(int k=0;k<arr3.length;k++)
		{
			arr3[k]=sc.nextInt();
		}
		System.out.println("The common elements are");
		
			
		commonelements(arr1,arr2,arr3);
		
		
		}
}