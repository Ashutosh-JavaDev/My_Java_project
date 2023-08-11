//have a good day greeting

import java.util.*;
class greet{
	String name;
	public void greeti(){
		//return name;
		System.out.println("Hello "+name.toUpperCase()+" have a good day");
		
	}
}
public class greeting{
public static void main(String[]args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	greet input=new greet();
	input.name=sc.next();
	input.greeti();
}
}
