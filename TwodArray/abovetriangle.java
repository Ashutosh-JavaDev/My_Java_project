//accept input from the user and priont the sum of above triangle
import java.util.*;
public class abovetriangle{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		
		int sum=0;
		System.out.println("Enter the size of row");;
		int row=sc.nextInt();
		System.out.println("Enter the size of coloumn");
		int col=sc.nextInt();
		int[][]matrix=new int[row][col];
		System.out.println("Enter the array elements");
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{ if(j>i)
				{
					sum=sum+matrix[i][j];
				}
			}
			System.out.println("The sum of the avobe triangle "+(i+1)+" is: " +sum);
		}
		
		
		
		
	}
}