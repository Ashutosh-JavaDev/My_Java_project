import java.util.*;
class data {
	int sum() {
		int add = 0;
		for (int i = 100; i <= 999; i++) {
			if (i % 7 == 0) {
				add += i;
			}
		}
		return add;

	}
}

public class hello{
	public static void main(String[]args){
		data ob=new data();
		int result=ob.sum();
		System.out.println("Result: "+result);
	}
}