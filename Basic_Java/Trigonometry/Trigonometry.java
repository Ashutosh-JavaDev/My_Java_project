//WAP to print formula of basic trigonometry

import java.util.*;

public class Trigonometry{

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
	
	sin=p/h;
	System.out.println(sin);
	
	cos=b/h;
	System.out.println(cos);
	
	tan=p/b;
	System.out.println(tan);
	
	sec=h/b;
		System.out.println(sec);
		
		cosec=h/p;
			System.out.println(cosec);
			
			cot=b/p;
				System.out.println(cot);
}
}
	
	
	
	
	
	
        