//table from 1 to n
import java.util.*;
public class table{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the  value from the wants to print");
		int a=sc.nextInt();
		System.out.println("Enter the value till table wants to print");
		int n=sc.nextInt();
		System.out.println("Enter the value till output has to be find");
		int m=sc.nextInt();
		/*System.out.println("Enter the value wants to print");
		int a=sc.nextInt();*/
		//int a=0;
	//	System.out.println("The Multipacation table of " +a+ " till "+n+ " is:");
		for(int i=a;i<=n;i++)
		{
			for(int k=1;k<=2;k++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=m;j++)
			{
				
				System.out.println(+i+ " X " +j+ "="+i*j+" "); 
			}
			
			  
		}
	
	}
}