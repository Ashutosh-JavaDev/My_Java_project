//calculate the frequency

import java.util.*;
public class frequency{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Line");
		String str=sc.nextLine();
		lengt(str);
	}
public static void lengt(String str){
	int st=str.length();
	System.out.println("The total length of the string is:	"+st);
}
}