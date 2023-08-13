//check that two sentence is  equal or not

import java.util.*;
public class string_comparision{
	public static boolean comparision(String str1,String str2){
		return str1.equals(str2);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first sentence");
		String str1=sc.nextLine();
		System.out.println("Enter the second Sentence");
		String str2=sc.nextLine();
		boolean result=comparision(str1,str2);
		if(result){
			System.out.println("Sentence are equal");
		}
		else{
			System.out.println("Sentence are not  equal");
		}
		
	}
}