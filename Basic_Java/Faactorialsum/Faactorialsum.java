//WAP to print the sum of 1/1+1/2+1/3....n term.

import java.util.*;

public class Faactorialsum{
	public static void main(String[] args){
		
		int i,n;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
            
			System.out.println("enter the value till want to take ");
			n=sc.nextInt();
			System.out.println();
			sc.close();
			
			for(i=1;i<=n;i++)
			{
				sum=sum+i;
				{
					//System.out.println(n);
				}
				
					
				
			}
			System.out.println("the value of given factorial is : "+sum);
	}
}
          
		
     	
		
		
		
		
		
		
		
		
		
		
	