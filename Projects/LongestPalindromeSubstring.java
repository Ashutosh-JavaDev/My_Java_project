import java.util.Scanner;
public class LongestPalindromeSubstring {
    public static String MaximumString(String str[], int size) {
        String maximum = "";
        int max = 0;

        for (int i = 0; i < size; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                String st = "";
                for (int k = j; k < str[i].length(); k++) {
                    st += str[i].charAt(k);
                    if (st.equalsIgnoreCase(new StringBuilder(st).reverse().toString())) {
                        int currentMax = st.length();
                        if (currentMax > max) {
                            max = currentMax;
                            maximum = st;
                        }
                    }
                }
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the String Array:");
        int size = sc.nextInt();
        sc.nextLine();
        String str[] = new String[size];
        System.out.println("Enter the values in the String Array:");
        for (int i = 0; i < size; i++) {
            str[i] = sc.nextLine();
        }
        String res = MaximumString(str, size);
        System.out.print("Maximum palindrome String: " + res);
    }
}
