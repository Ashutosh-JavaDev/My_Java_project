//program to find the power of  the  n
import java.util.*;
public class power_value{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value");
		float n=sc.nextFloat();
		System.out.println("Enter the power value");
		float p=sc.nextFloat();
		double re=power(n,p);
		System.out.println("The power value of "+n+" is : "+re);
	}
		
	public static double power(float n,float m){
		double result=Math.pow(n,m);
		return result;
	}	
}