//geometry formula
import java.util.*;
class formula{
	int arr[];
	float side,length,breadth,he,base,radius;
	//formula  for square
	public void square(){
		float s=side*side;
		System.out.println("Area of  square	:"+s);
		float p=4*side;
		System.out.println("Perimeter of square		:"+p);
	}
	//formula for rectangle
	public void rectangle(){
		float ar=length*breadth;
		System.out.println("Area of rectangle	"+ar);
		
		float per=2*(length+breadth);
		System.out.println("Perimeter of rectangle		"+per);
	}
	//formula  for  triangle
	public void  perim(int size){
		arr=new int[size];
	}
	public void triangle(){
		double are=0.5*base*he;
		float peri=0;
		System.out.println("Area of triangle	"+are);
		for(int i=0;i<arr.length;i++){
			peri=peri+arr[i];
		}
		System.out.println("perimeter of  Triangle	"+peri);
	}
	//formula for circle
	public void circle(){
		double ra=3.14*radius*radius;
		System.out.println("Radius of circle	"+ra);
		double cir=2*3.14*radius;
		System.out.println("Circumfreance		"+cir);
	}
}
public class geometry_formula{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	formula input=new formula();
	//initilization for square
	System.out.println("Enter the side of the square");
	input.side=sc.nextFloat();
	input.square();
	//initilization for rectangle
	System.out.println("Enter the length of rectangle");
	input.length=sc.nextFloat();
	System.out.println("Enter the breadth of the rectangle");
	input.breadth=sc.nextFloat();
	input.rectangle();
	//initilization for triangle
	System.out.println("Enter the base of the triangle");
	input.base=sc.nextFloat();
	System.out.println("Enter the height of the  rectangle");
	input.he=sc.nextFloat();
	System.out.println("How many sides are there in triangle");
	int size=sc.nextInt();
	input.perim(size);
	System.out.println("Enter the side of the triangle");
	for(int i=0;i<size;i++){
		
		input.arr[i]=sc.nextInt();
	}
	input.triangle();
	//initilization for circle
	System.out.println("Enter the radius of  the circle");
	input.radius=sc.nextFloat();
	input.circle();
	
}}