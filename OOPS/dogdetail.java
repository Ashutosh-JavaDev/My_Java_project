/*Write a Java program to create a class called "Dog" with a name and breed attribute.
 Create two instances of the "Dog" class, set their attributes using the 
 constructor and modify the attributes using the setter methods and print the updated values.*/
 
 import java.util.*;
 class Dog{
	String name,breed;
		public String dname(){
			return name;
		}
		public String dbreed(){
			return breed;
		}
		public String getname(){
			return name;
		}
		public void setname(String newName){
			name=newName;
		}
		public String getbreed(){
			
			return breed;
		}
		public void setbreed(String newBreed){
			breed=newBreed;
		}
}
public class dogdetail{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	Dog doggy=new Dog();
	Dog doggy2=new Dog();
	System.out.println("Enter the name of dog");
	doggy.name=sc.nextLine();
	System.out.println("Enter the breed");
	doggy.breed=sc.nextLine();
	System.out.println("Enter the name of second dog");
	doggy2.name=sc.nextLine();
	System.out.println("Enter the second breed");
	doggy2.breed=sc.nextLine();
	System.out.println("Doggy name is "+doggy.dname()+ " and the breed of the doggy is : "+doggy.dbreed());
	System.out.println("Second Doggy name is "+doggy2.dname()+ " and the breed of Second doggy is : "+doggy2.dbreed());
	System.out.println("Enter the new name of the doggy");
	String newName=sc.nextLine();
	doggy.setname(newName);
	System.out.println("Enter the new Breed of the doggy");
	String newbreed=sc.nextLine();
	doggy.setbreed(newbreed);
	System.out.println("New Breed of the Doggy is : "+doggy.getbreed());
}
}
 
