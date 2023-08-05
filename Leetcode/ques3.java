import java.util.*;
public class ques3{
	public static void median_of_sorted_array(int arr1[],int arr2[],int n,int m){
		int k=(n+m);
		int arr3[]=new int[k];
		for(int i=0;i<n;i++){
			arr3[i]=arr1[i];
		}
		for(int i=0;i<m;i++){
			arr3[n+i]=arr2[i];
		}
		for(int i=0;i<k-1;i++){
			for(int j=i+1;j<k;j++){
			if(arr3[i]>arr3[j]){
				int temp=arr3[i];
				arr3[i]=arr3[j];
				arr3[j]=temp;
			}
			}
		}
		int sum=0;
		float avg=0;
		System.out.println("The array after merging");
		for(int i=0;i<k;i++){
			System.out.print(arr3[i]+" ");
			sum=sum+arr3[i];
		}
		avg=(float)sum/k;
		System.out.println("Median of  the merging array: "+sum+" "+avg);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int size1=sc.nextInt();
		int arr1[]=new int [size1];
		System.out.println("Enter the first array elements");
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of second array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter the size of second  array elements");
		for(int i=0;i<size2;i++){
			arr2[i]=sc.nextInt();
		}
		median_of_sorted_array(arr1,arr2,size1,size2);
	}
}