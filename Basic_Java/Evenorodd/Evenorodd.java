//write a program to print number is even or odd

import java.util.*;

public class Evenorodd{
	
	public static void main(String[] args){
		
		int a,num;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your selective number");
		a=sc.nextInt();
		
		sc.close();
		
		if(a%2==0)
		{
			System.out.println("the number is even number");
		}
		else
		{
			System.out.println("the number is odd number");
		}
	}
}
		