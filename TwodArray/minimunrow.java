//Write a Java program to find the minimum element in each row of a given 2D array and display the results.

import java.util.*;
public class minimunrow{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
System.out.println("Enter the size of coloumn");
int col=sc.nextInt();
				int [][] arr=new int[row][col];
				for(int i=0;i<row;i++)
				{
					for(int  j=0;j<col;j++)
					{
						arr[i][j]=sc.nextInt();
						
					}
				}
				int  min=arr[0][0];
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						if(arr[i][j]<min)
						{
							min=arr[i][j];
							System.out.println("the min no is :"+min);
						}
					}
				}
				
	}
}