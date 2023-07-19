//print the prime, even and odd number from the array
//package Projects;
import  java.util.*;
public class  Prime_Even_Odd{
	public static void check_number(int arr[], int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			//System.out.println("Enter the elements in "+i+1+" array");
			arr[i]=sc.nextInt();
		}
		int p=0,e=0,o=0;
		System.out.println("Press 1: for check all even number\nPress 2: for check all odd number\nPress 3:for check all prime number\nPress 4: For display even and  odd number\nPress 5 : for display even and prime number\nPress 6:  for display odd and prime number\nPress 7: for display as the number input in array");
		int order=sc.nextInt();
		switch(order){
			case 1:
			
			System.out.print("The even numbers in array: ");
			for(int i=0;i<n;i++){
				if(arr[i]%2==0){
					System.out.print(arr[i]+" ");
				}
			}
			break;
			case 2:
			System.out.print("The odd number in array: ");
			for(int i=0;i<n;i++){
				if(arr[i]%2!=0){
					System.out.print(arr[i]+" ");
				}
			}
			break;
			case 3:
			System.out.print("The prime number in array: ");
			for( int i=0;i<n;i++){
				for(int j=1;j<=arr[i];j++)
				{
					if(arr[i]%j==0)
					{
						p++;
					}
				}
			if(p==2)
				{
					System.out.print(arr[i]+" ");	
				}
				p=0;
			}
			break;
			case 4:
			System.out.print("The even number in array: ");
			for(int i=0;i<n;i++){
				if(arr[i]%2==0){
					System.out.print(arr[i]+" ");
				}
			}
			System.out.print("\nThe odd number:");
			for(int i=0;i<n;i++){
				if(arr[i]%2!=0){
					System.out.print(arr[i]+" ");
				}
			}
				break;
				case 5:
				System.out.print("The even number in array: ");
				for(int i=0;i<n;i++){
				if(arr[i]%2==0){
					System.out.print(arr[i]+" ");
				}
				}
				System.out.print("\nThe prime number in array: ");
				for( int i=0;i<n;i++){
				for(int j=1;j<=arr[i];j++)
				{
					if(arr[i]%j==0)
					{
						p++;
					}
				}
				if(p==2)
				{
					System.out.print(arr[i]+" ");	
				}
				p=0;
				}
				case 6:
				System.out.print("The odd number  in array: ");
				for(int i=0;i<n;i++){
					if(arr[i]%2!=0)
					{
						System.out.println(arr[i]+" ");
					}
				}
				System.out.print("\nThe prime number in array:	");
			for( int i=0;i<n;i++){
				for(int j=1;j<=arr[i];j++)
				{
					if(arr[i]%j==0)
					{
						p++;
					}
				}
			if(p==2)
				{
					System.out.print(arr[i]+" ");	
				}
				p=0;
			}
			break;
			case 7:
			System.out.println("The same ouput as the number given in input");
			for(int i=0;i<n;i++){
				System.out.println(arr[i]+" ");
			}
			break;
			default:
			System.out.println("Invalid  Input\npress valid input");
			break;
		}
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many times you want to check the array");
		int s=sc.nextInt();
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		for(int i=0;i<s;i++){
			System.out.println("\n"+(i+1)+" array elements");
			int arr1[]=new int[size];
			check_number(arr1,size);
		}
		
	}
}