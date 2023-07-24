//Program for search the number by the user choice.
import java.util.*;
public class Search_By_UserChoice{
	public static boolean isarraySorted(int arr[],int n){
		for(int  i=1;i<n;i++){
			if(arr[i]<arr[i-1]){
				return false;
			}
		}
		return true;
	}
	public  static void binarysearch(int arr[],int n,int num){
		int f=0,l=n-1,mid=(f+l)/2,c=0,ans=-1;
		while(f<=l){
			if(arr[mid]==num){
				c++;
				ans=mid;
				System.out.println("Index:	"+(ans+1));
				f=mid+1;
			}
			else if(arr[mid]<num){
				f=mid+1;
			}
			else{
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		if(ans!=-1&&c>0){
			System.out.println(num+" is found in the  array");
		}
		else{
			System.out.println("The number is not found");
			
		}
	}
	public  static void linearsearch(int arr[],int n,int num){
		int p=0;
		for(int i=0;i<n;i++){
			if(arr[i]==num){
				System.out.println("Position:	"+(i+1));
			p++;
			}
		}
		if(p>0){
			System.out.println(num+ "is found " +p+" times");
		}
		else{
			System.out.println("The number is not found");
		}
	}
	public static void user_choice(int arr[],int n,int num){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1: for Binary Search");
		System.out.println("Press 2: For Linear Search");
		int press=sc.nextInt();
		boolean issorted=isarraySorted(arr,n);
			switch(press){
				case 1:
				if(issorted){
				binarysearch(arr,n,num);
				break;
				}
				else{
				System.out.println("Enter the  array in sorted manner\nOr press 2");
				}
				case 2:
				linearsearch(arr,n,num);
				break;
				default:
				System.out.println("Press valid key");
				break;
			}
		}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("How many times you want to check Cases");
		int s=sc.nextInt();
		for(int i=0;i<s;i++){
			System.out.println("Enter the number wants to search");
			int num=sc.nextInt();
			user_choice(arr,size,num);
		}
	}
}