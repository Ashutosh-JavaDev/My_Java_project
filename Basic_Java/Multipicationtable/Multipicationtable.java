//WAP to print multipication table of given number

import java.util.*;

public class Multipicationtable{
	
	public static void main(String[] args){
		
		int n,i,num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the given table ");
		num=sc.nextInt();
		
		System.out.println("enter the value ");
		n=sc.nextInt();
		
		sc.close();
		
		for(i=1;i<=n;i++)
			
			{
				System.out.println("value_1*value_2: "+num*i);
			}
		
	}
}
		