import java.util.*;

class IntegerCheck {
    int value;
	String input;

    public void check() {
        Scanner sc = new Scanner(System.in); // Moved the Scanner creation inside the method
        
        if (sc.hasNextInt()) {
            value = sc.nextInt(); // Read the input value
            System.out.println("Integer value: " + value);
        } else {
             input = sc.next();
            System.out.println("Not an integer value: " + input);
        }
        
        sc.close(); // Close the Scanner
    }
}

public class detectinng_the_value {
    public static void main(String[] args) {
        IntegerCheck in = new IntegerCheck();
		System.out.println("Enter the  number");
        in.check();
    }
}
