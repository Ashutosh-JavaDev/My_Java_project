//Wap to print n number of array value

import java.util.*;
public class n_number_of_array{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter ther size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the value, that how many array want to print");
		int n=sc.nextInt();
		int sum=0;
		
		 System.out.println("Enter the values of the arrays");
        for (int i = 1; i <= n; i++) {
           System.out.println("Enter values for array " + i);
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
		

            System.out.println("Array " + (i ) + " values:");
            for (int j = 0; j < size; j++) {
                System.out.println("Array[" + j + "]: " + arr[j]);
				sum=sum+arr[j];
            }
		}
		System.out.println("Sum of "+n+ " array =" +sum);
        
	}
}