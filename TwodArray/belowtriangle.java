//Accept the number from the user and find the sum of below triangle
import java.util.*;
public class belowtriangle{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		
		int sum=0;
		System.out.println("Enter the row size");
		int row=sc.nextInt();
		System.out.println("Enter the coloumn size");
		int col=sc.nextInt();
		int [][]matrix=new int[row][col];
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
				if(i>j){
					sum=sum+matrix[i][j];
				}
				
				}
				System.out.println("The sum of below triangle "+(i+1)+ " is :"+sum);
			}
		
	}
}