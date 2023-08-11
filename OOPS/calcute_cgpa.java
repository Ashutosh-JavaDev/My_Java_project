//calcute gcpa

import java.util.*;
class gcpa{
	int marks[];
	public gcpa(int size){
		marks=new int[size];
	}
	public float calculate(){
		int s=0;
		for(int i=0;i<marks.length;i++){
			s=s+marks[i];
		}
		float avg=0;
		avg=(float)s/marks.length;
		return avg;
	}
}
public class calcute_cgpa{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total subject");
	int size=sc.nextInt();
	gcpa input=new gcpa(size);
	for(int i=0;i<size;i++){
		System.out.println("subject "+(i+1));
		input.marks[i]=sc.nextInt();
	}
	System.out.println("Average	:"+input.calculate());
}
}