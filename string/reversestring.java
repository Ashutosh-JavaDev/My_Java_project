//wap to print reverse the srting

import java.util.*;
public class reversestring{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter something");
		String str=sc.nextLine();
		reverse(str);
	}
	public static void reverse(String str){
		String st="";
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			st=st+ch[i];
		}
		System.out.println(st+" ");		
	}
}