/* 4/3 × π × radius3.*/
//WAP to find all total formula of circle.

import java.util.*;

public class Formulaofcircle{
	public static void main(String[] args){
		
		double r,Volume,pie=3.14;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of r ");
		r=sc.nextDouble();
		
		sc.close();
		
		Volume= (4.0/3.0)*pie*(r*r*r);
		
		{
			System.out.println("the volume of circle is : "+Volume);
		}
	}
}