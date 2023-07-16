import java.util.*;
public class indexofmatrix{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of row  elements");
		int row=sc.nextInt();
		System.out.println("Enter the size of coloums elements");
		int col=sc.nextInt();
	
		int [][] matrix=new int[row][col];
		System.out.println("Enter the array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the number found in array");
		
		int num=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j] + " ");
				if(matrix[i][j]==num)
				
				{
					System.out.print("\tThe row number :"+i+" and the coloum number :"+j+" ");
				}
			
				
			}
			
			System.out.println();	
			
		}
		
	}	
	
}