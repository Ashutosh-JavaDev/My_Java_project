package Basic_Java;
import java.util.*;
public class Divisible5or7 {
    public static boolean result(int number) {
        boolean output = false;
        if ((number % 5 == 0) && (number % 7 == 0)) {
            output = true;
        } else {
            System.out.println("Number is not Divisible by 5 and 7 both");
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number wants to check");
        int number=sc.nextInt();
        boolean answer=result(number);
        System.out.println("Number is Divisible By 5 and 7 Both");
    }
}
