// Write a java program to read the age of a candidate and determine whether it is eligible for casting his/her own vote. 

import java.util.*;

public class Eligiblity_criteria{
	
	public static void main(String[] args){
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your present age");
		age=sc.nextInt();
		
		sc.close();
		
		if(age>=18)
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("you are not eligible for voting");
		}
	}
}
	
