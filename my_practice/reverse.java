//programm will take input from the user and  diplay the reverse output to the user
import java.util.*;
public class reverse{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for reverse");
		int a=sc.nextInt();
		reverse(a);
	}
	public static void reverse(int num){
		int rev=0;
		while(num>0){
			int d=num%10;
			 rev=rev*10+d;
			num=num/10;
		}
		System.out.println("output : "+rev);
		
	}
}