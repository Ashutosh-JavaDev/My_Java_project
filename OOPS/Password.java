import java.util.Scanner;

class password {
    public static String writePassword(String create, String newCreate) {
        Scanner scc = new Scanner(System.in);
        int Ascii = 0;
        System.out.println(
                "Password must Contain a UpperCase, a LowerCase, Numeric Digit, Specific Symbols,should be 8-16 letters.");
        System.out.print("Create Your Password: ");
        create = scc.nextLine();
        int len = create.length();
        if (len >= 8 && len <= 16) {
            for (int i = 0; i < len; i++) {
                char ch = create.charAt(i);
                Ascii = (int) ch;
            }
            if (Ascii >= 64 && Ascii <= 90 && Ascii >= 97 && Ascii <= 122 && Ascii == 32) {

            }

        } else {
            System.out.println("Password must contains 8-16 words.");
        }
        System.out.print("Re-Enter Your Password: ");
        newCreate = scc.nextLine();
        String pass = "";

        return pass;
    }
}

public class Password {

}
