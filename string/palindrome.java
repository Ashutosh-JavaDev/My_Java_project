//check  wheather the string is palindrome or not

import java.util.*;
public class palindrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		palindromecheck(str);
	}
	public static void palindromecheck(String str){
		String st="";
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			st+=ch[i];
		}
		System.out.print(st+" ");
		if(str.equals(st)){
			System.out.println("\nString is palindrome");
		}
		else{
			System.out.println("\nString is not palindrome");
		}
	}
}