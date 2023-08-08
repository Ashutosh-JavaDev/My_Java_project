//number is prime or  not
import java.util.*;
public class  prime{
	public static boolean isprime(int num){
		
		boolean result=true;
		int c=0,i=1;
		while(i<=num){
			if(num%i==0){
				c++;
			}
			i++;
		}	
		if(c==2){
			return result;
		}
		else{
			return false;
		}
	}	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number wants to check");
		int num=sc.nextInt();
		boolean r=isprime(num);
		System.out.println(r);
	}
}