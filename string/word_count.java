//print the number of words in the  sentence

import java.util.*;
public class word_count{
	public static int count_word(String str){
		String st[]=str.split(" ");
		return st.length;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		int s=count_word(str);//calling the function
		System.out.println("Total Words in the Sentence:	"+s);
	}
}