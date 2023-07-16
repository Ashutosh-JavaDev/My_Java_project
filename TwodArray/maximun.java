//Given a 2D array of integers, write a Java program to find the maximum element in the array.

import java.util.*;
public class maximun{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		System.out.println("Enter the size of coloumns");
		int col=sc.nextInt();
			
			int[][]arr=new int[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			int max=arr[0][0];
			int arrIndex=0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(arr[i][j]>max)
					{
						max=arr[i][j];
						arrIndex = i + j;
					}
					
				}
			}
		 System.out.println("Maximum element: " + max);
        System.out.println("Index of the maximum element: " + arrIndex);
		
		
		
	}
}