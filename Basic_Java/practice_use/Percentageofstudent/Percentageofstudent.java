//WAP to print percentage of student

import java.util.*;
public class  Percentageofstudent{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum; 
		double p;
		sum=a+b+c+d+e;
		{
			
			System.out.println("Total marks "+sum);
			p=sum/5.0;{
			System.out.println("percentage "+p);
			}
		}
	}
}