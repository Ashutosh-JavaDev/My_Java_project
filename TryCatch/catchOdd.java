import java.util.Scanner;

class Oddcatching {

    public static void even(int num, int size) throws IllegalArgumentException {
        if (num % 2 != 0) {
            throw new IllegalArgumentException(num + " : is ODD. ");
        }
    }
}

public class catchOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Values in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Oddcatching ob = new Oddcatching();
        for (int i = 0; i < size; i++) {

        }
    }
}
