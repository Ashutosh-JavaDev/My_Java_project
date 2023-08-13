//display the sentence after removing the space

import java.util.*;
public class remove_space{
	public static void space_remove(String str){
		//we can use "char st[]=str.toCharArray();" to convert the string into array
		String st[]=str.split(" ");
		 String t = String.join("", str);
		System.out.println(t);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		space_remove(str);
	}
}