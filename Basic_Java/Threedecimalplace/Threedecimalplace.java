//Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.*;

public class Threedecimalplace{
	
	public static void main(String[] args){
		
		float x;
		float y;
		
		Scanner.sc=new Scanner (System.in);
		
		System.out.println("enter the input one");
		x=sc.nextfloat();
		
		System.out.println("enter your second input");
		y=sc.nextfloat();
		
		 x =Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;
		
		if(x==y)
	{	
		System.out.println("the decimals are same");
		
    }
	
	else
	{
		System.out.println("they are difference");
	}
	}
}
   	