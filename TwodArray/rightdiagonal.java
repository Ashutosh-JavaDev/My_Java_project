//accept the 3 by 3 matrix from the user and print the sum of the right digonal

import java.util.*;
public class rightdiagonal{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter the size of the row");
		int row=sc.nextInt();
		System.out.println("Enter the size of the coloumns");
		int col=sc.nextInt();
		int[][]matrix=new int[row][col];
		System.out.println("Enter the array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i+j==2){
					sum=sum+matrix[i][j];
				}
			}
			System.out.println("The sum of right diagonal "+(i+1)+"is: "+sum);
		}
	}
}