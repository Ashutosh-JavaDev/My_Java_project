//WAP to print reverse of  number

import java.util.*;

public class Revresenumber{

    public static void main(String[] args){

        int i,num;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value :");
        
        num=sc.nextInt();
        
        String num1 = Integer.toString(num);

        char ch[]= num1.toCharArray(); 
		
		for(i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
       /*    String arr2="";
		   arr2=arr2+ch[i];
		   {
			   System.out.println(arr2);
		   }*/
        
        
    }
}