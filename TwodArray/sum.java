import java.util.*;
public class sum{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("nter the array elements");
		int sum=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of " +size+ " number is " +sum);
		
		
	}
}