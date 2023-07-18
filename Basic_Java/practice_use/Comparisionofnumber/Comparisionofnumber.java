/*WAP to print number is grearter,smaller or equal*/

import java.util.*;

public class Comparisionofnumber{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of first number");
		int a=sc.nextInt();
		System.out.println("enter the value of second number");
		int b=sc.nextInt();
				
		if(a==b){
		System.out.println("a and b are equal");
		}
		else if(a>b)
		{System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
	}
}
			
			