//accept 3 by 3 matrix from the user and print the sum of left diagonal

import java.util.*;
public class leftdiagonal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter thre size of the row");
		int row=sc.nextInt();
		System.out.println("Enter the the of the coloumn");
		int col=sc.nextInt();
		int[][]matrix=new int[row][col];
		System.out.println("Enter the matrix elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
		for (int j=0;j<col;j++)
		{
			if(i==j){
				sum=sum+matrix[i][j];
			}
		}
		System.out.println("The sum of left diagonal"+(i+1)+ "is "+sum);
		}
	}
}