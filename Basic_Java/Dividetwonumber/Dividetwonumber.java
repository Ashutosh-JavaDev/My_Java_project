//write a program to print division of two number

import java.util.*;

public class Dividetwonumber{
	
	public static void main(String[] args){
		
		int num1,num2,divide;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		
		System.out.println("enter num2");
		num2=sc.nextInt();
		
		sc.close();
		
		divide=num1/num2;
		
		System.out.println("the division of two number is: "+divide);
	}
}