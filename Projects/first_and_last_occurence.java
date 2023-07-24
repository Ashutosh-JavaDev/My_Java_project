import java.util.*;
public class first_and_last_occurence{
	public static int first_occurence(int arr[],int n,int num){
		int f=0,l=n-1,mid=(f+l)/2,c=0,ans=-1;
		while(f<=l){
			if(arr[mid]==num){
				ans=mid;
				l=mid-1;
			}
			else if(arr[mid]<num){
				f=mid+1;
			}
			else{
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		return ans;
	}
	public static int last_occurence(int arr[],int  n,int num){
		int f=0,l=n-1,mid=(f+l)/2,c=0,ans=-1;
		while(f<=l){
		if(arr[mid]==num){
			ans=mid;
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
		return ans;
		
	}
	public static int total_count(int arr[],int n,int num){
		int p=(last_occurence(arr,n,num)-first_occurence(arr,n,num))+1;
		return p;

	} 
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the  array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the number wants to search");
		int num=sc.nextInt();
		int m=first_occurence(arr1,size,num);
		if(m!=0){
			System.out.println("The first occurence is "+m);
		}
		else{
			System.out.println("The number is not found");
		}
		int y=last_occurence(arr1,size,num);
		if(y!=0){
			System.out.println("The last occurence is "+y);
		}
		else{
			System.out.println("The number is not found");
		}
		int k=total_count(arr1,size,num);
		System.out.println("The total counting of the number "+num+" is "+k);
	}
}