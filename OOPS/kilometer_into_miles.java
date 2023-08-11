//kilometer into miles
import java.util.*;
class unit_convertor{
	float km;
	public double convertor(){
		double miles=km/1.609;
		return miles;
	}
}
public class kilometer_into_miles{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Kilometer");
		unit_convertor input=new unit_convertor();
		input.km=sc.nextFloat();
		double mil=input.convertor();
		String formatted=String.format("%.5f",mil);
		System.out.println("Miles	: "+formatted);
	}
}