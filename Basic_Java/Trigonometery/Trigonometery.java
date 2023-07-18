//WAP to print formula of basic trigonometry

import java.util.*;

public class Trigonometery{

public static void main(String[] args){

    float sin,cos,tan,sec,cosec,cot;
	int p,b,h;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the value for perpendicular ");
	p=sc.nextInt();
	
	System.out.println("enter the value for base ");
	b=sc.nextInt();
	
	System.out.println("enter the value for height ");
	h=sc.nextInt();
	
	sin=((float)p/h);
	System.out.println("the value of sin is "+sin);
	
	cos=((float)b/h);
	System.out.println("the value of cos is "+cos);
	
	tan=((float)p/b);
	System.out.println("the value of tan is "+tan);
	
	sec=((float)h/b);
		System.out.println("the value of sec is "+sec);
		
		cosec=((float)h/p);
			System.out.println("the value of cosec is "+cosec);
			
			cot=((float)b/p);
				System.out.println("the value of cot is "+cot);
}
}
	
	
	
	
	
	
        