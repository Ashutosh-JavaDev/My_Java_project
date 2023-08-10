//entring tyhe dewtailos of the employee
import java.util.*;
class ployee{
	String name;
	int salary;
	int id;
	public void print_detail(){
		System.out.println("The name of the employee is : "+name);
		System.out.println("The ID of the employee is : "+id);
	
	//public void print_Salary(){
		System.out.println("Salary	:"+salary);
	}
}
	public class employee{
		public static void main(String[]args){
			//Scanner c=new Scanner(System.in);
			ployee input=new ployee();
		//	ployee sc=new ployee();
			input.name="Ayush";
			//System.out.println("Enter first salary");
			input.salary=1234;
		//	System.out.println("Enter the first ID");
			input.id=32;
			input.print_detail();
			
		}
	}
