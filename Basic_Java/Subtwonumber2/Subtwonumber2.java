//write a program to print subtract of two number

import java.util.*;

public class Subtwonumber2{
	
	public static void main(String[] args) {
		
		int num1,num2,sub;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of num1 ");
		num1=sc.nextInt();
		
		System.out.println("enter the value of num2 ");
		num2=sc.nextInt();
		
		sc.close();
		
		sub=num2-num1;
		
		System.out.println("the value of that subtraction is : "+sub);
	}
}	
		