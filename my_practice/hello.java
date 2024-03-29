import java.util.Scanner;
class sorting{
	public void sort(int arr[],int size){
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size-i-1;j++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			
		}
		System.out.println();
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");		
		}
	}
}
public class hello{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the Size of the array");
		 int size=sc.nextInt();
		 int arr[]=new  int[size];
		 System.out.println("Enter the Number in the  Array");
		 for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		 }
		 sorting ob=new sorting();
		 ob.sort(arr, size);
	}
}