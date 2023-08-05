import java.util.*;
public class index{
	public static  void index(String st,int s){
		System.out.println("The index of "+st+ " is "+st.indexOf(s));
	}

public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String t=sc.nextLine();
	System.out.println("Enter the index wants to search");
	int i=sc.nextInt();
	index(t,i);
}
}