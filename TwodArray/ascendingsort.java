import java.util.*;
public class ascendingsort{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the array elemnts");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The ascending order after sorting:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}