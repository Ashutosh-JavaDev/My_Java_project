import java.util.*;
public class upper_to_lower{
	public static void change_case(String str){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1: To change the sentence in uppper case\nPress 2: TO  change the sentence in lower case");
		int press=sc.nextInt();;
		switch(press){
			case 1:
			String st=str.toUpperCase();
			System.out.println(st);
			break;
			case 2:
			String sr=str.toLowerCase();
			System.out.println(sr);
			break;
			default:
			System.out.println("Press valid key");
			break;
		}
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		change_case(str);
		
	}
}