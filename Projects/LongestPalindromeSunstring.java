import java.util.Scanner;

public class LongestPalindromeSunstring {
    public static String MaximumString(String str[], int size) {
        String maximum = "";
        String st = "";
        int currentMax = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                char ch = str[i].charAt(i);
                st += ch;
                if (str[j].equalsIgnoreCase(st)) {
                    currentMax = str[j].length();
                    if (currentMax > max) {
                        max = currentMax;
                        maximum = str[i];
                    }
                    currentMax=0;
                }
            }
        }
        return maximum;
    }
}
