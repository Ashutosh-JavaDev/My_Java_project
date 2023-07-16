//Write a Java program to calculate the sum of all the elements in a given 2D array.

import java.util.*;
public class twoarraysum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the rows");
		int row=sc.nextInt();
		System.out.println("Enter the coloumns of the array");
		int col=sc.nextInt();
		int [][] arr1=new int[row][col];
		int arr2 [][]=new int[row][col];
		int arr3[][]=new int [row][col];
		
	System.out.println("Enter the array elements");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++)
	{
		for (int j=0;j<col;j++)
		{
			arr2[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++)
	{
		for( int j=0;j<col;j++)
		{
			arr3[i][j]=arr1[i][j]+arr2[i][j];
			//System.out.println("The sum of two array is : "+arr3[i][j]);
		}
	}
	 System.out.println("The sum of the two arrays is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr3[i][j] + " ");
            }
		}
		System.out.println();
	}
}