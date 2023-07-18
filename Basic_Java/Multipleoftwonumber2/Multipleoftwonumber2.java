
//write a program to print multiple of three number

import java.util.*;

public class Multipleoftwonumber2{
	
	public static void main(String[] args){
		
		int num1,num2,num3,mul;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		
		System.out.println("enter num2");
        num2=sc.nextInt();
		
		System.out.println("enter num3");
		num3=sc.nextInt();
		
		sc.close();
		
		mul=num1*num2*num3;
		
		
		System.out.println("the multiple of three number is: "+mul);
	}
}