import java.util.*;
public class Natural_number{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	
	System.out.print("enter the required value till the number wants to go ");
	int n=sc.nextInt();
	//int j=sc.nextInt();
	
	
	for(int i=2;i<=n;i++)
	{
		if(i%2==0)
	System.out.println(i);
	}
}
}
