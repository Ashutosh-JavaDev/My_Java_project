//return array from meathod
import java.util.*;
public  class return_array{
	public static int[] return_array(int arr[],int n){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the array elements");
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	System.out.println("How many times wants to excute the array");
	int s=sc.nextInt();
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	for(int i=0;i<s;i++){
		int arr1[]=new int[size];
		int arr2[]=return_array(arr1,size);
		System.out.println("The array is:");
		for(int element:arr2){
			System.out.print(element+" ");
		}
	}
		//System.out.println();
	
	}
}