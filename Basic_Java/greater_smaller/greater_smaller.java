//Write a java program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0.

import java.util.*;

public class greater_smaller{
	
	public static void main(String[] args){
		
		int m;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the value of m");
		m=sc.nextInt();
		
		sc.close();
		
		if(m>0)
		{
			System.out.println("the number is 1");
		}
		else if(m<0)
		{
			System.out.println("the number is -1");
		}
		else
		{
			System.out.println("the number is 0");
		}
	}
}
 