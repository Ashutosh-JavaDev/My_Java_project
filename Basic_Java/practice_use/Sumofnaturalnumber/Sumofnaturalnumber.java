//WAP to print sum of n natural number

import java.util.*;

public class Sumofnaturalnumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of natural number");
		 int n=sc.nextInt();
		 
		 int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			 sum=sum+i;
			 
		 }
		 System.out.println("sum of n natural number is :"+sum);
	}
}
