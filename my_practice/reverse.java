//programm will take input from the user and  diplay the reverse output to the user
//1+4/3+7/9+10/27
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

public class reverse {
	public static void main(String[] args) {
		data ob=new data();
		int result = ob.sum();
		System.out.println("Result: " + result);
	}

}