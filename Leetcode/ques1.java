import java.util.*;
public class ques1{
	public static boolean targetsum(int arr[],int n,int num){
		boolean result=false;
		int c=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
			if(arr[i]+arr[j]==num){
				result=true;
				c++;
				System.out.println("["+arr[i]+"]+["+arr[j]+"]="+num);
			}
			}
		}
		if(c>0){
			
			System.out.println("Total count	:"+c);
		}
		return result;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target value");
		int num=sc.nextInt();
		boolean r=targetsum(arr,size,num);
		if(r==true){
			System.out.println("The number is found");
		}
		else if(r!=true){
			System.out.println("The number is not found");
		}
		
	}
}