//Hollow star pattern
import java.util.*;
public class x{
	public static void square(int n){
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j||(i+j==n+1))
				{
					System.out.print("*");
				}
				if(i>j&&(i+j!=n+1)&&(i+j<n+1))
				{
					System.out.print("-");

				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("How mant times wants to print loop");
		int s=sc.nextInt();
		System.out.println("Enter the size of the loop");
		int size=sc.nextInt();
		for(int i=1;i<=s;i++){
			System.out.println("The "+i+" loop");
		square(size);
		}
	}
}