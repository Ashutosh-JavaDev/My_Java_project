package Loop;

public class ReverseOddLessThanOne {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j*2-1);

            }
            System.out.println();
        }
    }
}
