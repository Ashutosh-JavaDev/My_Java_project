//count the vowel and constant

import java.util.*;
public class vowel_and_constant{
	public static void  main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		count(str);
	}
	public static void count (String str){
		int v=0,c=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else{
				c++;
			}
		}
		System.out.println("Vowel:		"+v);
		System.out.println("Constant:	"+c);
	}
	
}