import java.util.*;
public  class  ques7{
	public  static void reverse_integer(int arr[],int n){
		for(int i=n-1;i>=0;i--){
		System.out.print(arr[i]);
		}
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size1=sc.nextInt();
		int arr[]=new int[size1];
		System.out.println("Enter the array elements");
		for(int i=0;i<size1;i++){
			arr[i]=sc.nextInt();
		}
		reverse_integer(arr,size1);
	}
}
