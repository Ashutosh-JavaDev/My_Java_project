//Write a Java program to add two matrices of the same size.

import java.util.*;
public class Matrix_sum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the row ");
		int row=sc.nextInt();
		System.out.println("Enter the size of coloum");
		int col=sc.nextInt();
		int arr[][]=new int [row][col];
		System.out.println("Enter the elements in array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print("Row [" +i+ "] col [" +j+ "] : ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum=sum+arr[i][j];
			}
		}
		System.out.println("The sum of [" +row+ "][" +col+ "] :" +sum);
	}
}