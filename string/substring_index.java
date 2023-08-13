//Substring of the string

import java.util.*;
public class substring_index{
	public static void sub_index(String str){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for starting Index");
		int f=sc.nextInt();
		System.out.println("Enter the  value  for ending index");
		int e=sc.nextInt();
		String st=str.substring((f-1),e);
		System.out.println(st);
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sub_index(str);
	}
}