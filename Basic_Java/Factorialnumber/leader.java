//39. Write a Java program to print all the LEADERS in the array.  
//Note: An element is leader if it is greater than all the elements to its right side.
import java.util.*;
public class leader{
	public static void leader(int arr[],int n){
	Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[n-1];
		for(int i=n-2;i>0;i--)
		{
		   if(arr[i]>=max){
			   System.out.println(arr[i]);
		   }
		}
		
		System.out.println("Note: An element is leader if it is greater than all the elements to its right side.");
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("How to Array wants to check");
		int s=sc.nextInt();
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		for(int i=0;i<s;i++){
			int arr1[]=new int [size];
			leader(arr1,size);
		}
	}
}