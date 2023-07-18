import java.util.*;

public class Counting_prime_number{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter the value from the counts wants to start");
	int n1=sc.nextInt();
	System.out.println("enter the value till the value wants to go");
	int n2=sc.nextInt();
	
	int i,j;
	int count=0;
	
	
	for(i=n1;i<=n2;i++)
	{
		for(j=2;j<=i;j++)
		{
			if(i%j==0)
				break;
		}
		if(i==j)
		{
			System.out.println(j+" ");
		}
	}
	}
}
