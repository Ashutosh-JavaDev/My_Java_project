import java.util.*;
public class printalpphabet{
	public static void printalpphabet(int k){		
	switch(k){
		case 1:	
		for(char a='A';a<='Z';a++){
			System.out.print(a+" ");
		}
		break;
		case 2:
		for(char b='a';b<='z';b++){
			System.out.print(b+" ");
		}
		break;
		case 3:
		for(char f='Z';f>='A';f--){
			System.out.print(f+" ");
		}
		break;
		case 4:
		for(char l='z';l>='a';l--){
			System.out.print(l+" ");
		}
		break;
		default:
		System.out.println("Enter the vaild key");
		break;
		
	}
	}
	public static  void main(String[]aargs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1: for Upper-Case Alphabet");
		System.out.println("Press 2: for Lower-Case Alphabet");
		System.out.println("Press 3: for reverse Upper-Case Alphabet");
		System.out.println("Press 4: for reverse Lower-Case Alphabet");
		int s=sc.nextInt();
		printalpphabet(s);
	}
}