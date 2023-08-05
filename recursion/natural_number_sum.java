import java.util.*;
public class natural_number_sum{
	public static  int natural_number_sum(int i,int n,int sum){
		if(i>n){
			return sum;
		}
		else{
			sum=sum+i;
			return natural_number_sum(i+1,n,sum);
		}
	
	}
	public static  void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vaue till number will call");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		int output=natural_number_sum(i,n,sum);
		System.out.println(output);
	}
}