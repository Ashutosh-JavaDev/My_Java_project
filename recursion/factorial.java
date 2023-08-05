import java.util.*;
public class factorial{
	public static int factorial(int i,int n, int pro){
		if(i>n){
			return pro;
		}
		else{
			 pro=pro*i;
			return factorial(i+1,n,pro);
		}
	}
	public static  void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int i=1,pro=1;
		System.out.println("Enter the size of the loop");
		int n=sc.nextInt();
		int f=factorial(i,n,pro);
		System.out.println("Factorial	:"+f);
	}
}