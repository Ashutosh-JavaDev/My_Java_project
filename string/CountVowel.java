import java.util.Scanner;

class Vowel {
    String Str;

    int get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}

public class CountVowel {
    public static void main(String[] args) {
        Vowel ob = new Vowel();
        int result = ob.get();
        System.out.println("No of Vowel:    " + result);
    }

}
