//three number sum
import java.util.*;
class sum
{
	int arr[];
	public sum(int size)
	{
		arr=new int[size];
	}
	public int sum1()
	{
		int s=0;
		for(int i=0;i<arr.length;i++){
			s=s+arr[i];
		}
		return s;
	}
}
	public class three_number_sum{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the size of the array");
			int size=sc.nextInt();	
			sum input=new sum(size);			
			System.out.println("Enter the array elements");
			for(int i=0;i<size;i++){
				input.arr[i]=sc.nextInt();
			}
			
			System.out.println("sum	:"+input.sum1());
		}
	}
