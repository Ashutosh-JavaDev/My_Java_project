//Accept 3 by 3 matrix from user and print the sum of row

import java.util.*;
public class mstrixsum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		System.out.println("Enter the size of coloum");
		int col=sc.nextInt();
		int [] [] matrix=new int[row][col];
		System. out.println("Enter the  array elements");
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
				sum=sum+matrix[i][j];
				
			}
			System.out.println("Sum of elements in row " + (i + 1) + ": " + sum);
		}
		//System.out.println("The sum of row is :"+sum);
		//sc.close();
		
		
		
		
		
		
	}
	
}