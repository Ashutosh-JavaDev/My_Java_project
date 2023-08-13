//print the lenggth of the string without using built in function
import java.util.*;
public class length_without_builtin_function{
	public static void lenggth(String str){
		int c=0;
		
		for(int i=0;i<str.length();i++){
			 int st=str.charAt(i);
			c++;
		}
		System.out.println("Length:	"+c);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		lenggth(str);
	}
}