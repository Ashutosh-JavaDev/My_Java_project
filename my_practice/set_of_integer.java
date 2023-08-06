//set of even and  odd number sum
import java.util.*;
public class set_of_integer{
	public static void set_of_integer(int n){
		int sum=0,s=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println("\nThe sum of even number is  :"+sum);
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				System.out.print(i+" ");
				s=s+i;
			}
		}
		System.out.println("\nThe sum of odd number is  :"+s);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the  value till  loop will excute");
		int n=sc.nextInt();
		set_of_integer(n);
	}
}