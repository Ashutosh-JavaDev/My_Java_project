//Find a peak element in an array, which is an element that is greater than its neighbors. 
import java.util.*;
public class peak_elements{
	public static int  peak(int arr[],int n){
		int  f=0,l=n-1;
		while(f<l-1){
			int mid=f+(l-f)/2;
		if(arr[mid]<arr[mid+1]){
			
			f=mid+1;
		}
		else{
			
			l=mid;
		}
	  }
	  return arr[f] > arr[l] ? arr[f] : arr[l];
	}
	public  static  void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int high=peak(arr,size);
		System.out.println("The highest peak is : "+high);
	}
}