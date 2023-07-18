//WAP to print armstrong number

import java.util.*;

public class armstrong{

       public static void main(String[] args){
		   
		   int num,r,sum=0,i;
		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("enter the value you want to check");
		   num=sc.nextInt();
		   
		  for(i=num;num!=0;num=num/10){
			  r=num % 10;
			  sum=sum+(r*r*r);
		  }
		  if(sum==i)
			  System.out.println("number is armstrong number");
		  else
			  System.out.println("number is not an armstrong number");
}}