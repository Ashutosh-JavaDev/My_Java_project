//WAP to find phythagorous theorom.

import java.lang.Math;
import java.util.*;

public class phythagoroustheorom{
	
	public static void main(String[] args){
		
		double p,b,h;
		//float a=p*p+b*b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of perpendicular");
		p=sc.nextDouble();
		
		System.out.println("enter the value of base");
		b=sc.nextDouble();
		
		/*System.out.println("enter the value of hypotenous");
		h=sc.nextFloat();*/
		
		sc.close();
		
		h=Math.sqrt((p*p)+(b*b));
		
		/*h=sqrt(p*p+b*b);
		
		h=sqrt(a);*/
		
		System.out.println("the sqrt of hypotenous is "+h);
		
	}
}