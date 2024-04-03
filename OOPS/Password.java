import java.util.Scanner;

class password {

    public static boolean writePassword() {
        boolean result = false;
        String create;
        String newCreate;
        Scanner scc = new Scanner(System.in);
        int Ascii = 0;
        System.out.println(
                "Password must Contain a UpperCase, a LowerCase, Numeric Digit, Specific Symbols,should be 8-25 letters.");
        System.out.print("Create Your Password: ");
        create = scc.nextLine();
        int len = create.length();
        int upper = 0;
        int lower = 0;
        int Specific = 0;
        int digit = 0;

        while (true) {
            if (len >= 8 && len <= 25) {
                for (int i = 0; i < len; i++) {
                    char ch = create.charAt(i);
                    Ascii = (int) ch;
                    if (Ascii >= 64 && Ascii <= 90) {
                        upper++;
                    } else if (Ascii >= 97 && Ascii <= 122) {
                        lower++;
                    } else if (Ascii >= 48 && Ascii <= 57) {
                        digit++;
                    } else if ((Ascii >= 33 && Ascii <= 47) || (Ascii >= 58 && Ascii <= 64)
                            || (Ascii >= 91 && Ascii <= 96) || (Ascii >= 123 && Ascii <= 126)) {
                        Specific++;
                    }
                }
                if (upper > 0 && lower > 0 && digit > 0 && Specific > 0) {
                    System.out.println("Password Contains all the Criteria.");
                    System.out.print("Re-Enter Your Password: ");
                    newCreate = scc.nextLine();
                    if (newCreate.equals(create)) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                } else {
                    System.out.println(
                            "Password must Contain a UpperCase, a LowerCase, Numeric Digit, Specific Symbols,should be 8-25 letters.");
                    break;
                }

            } else {
                System.out.println("Password must contains 8-25 words.");
                break;
            }

        }
        return result;
    }
}

public class Password {
    public static void main(String[] args) {
        password ob = new password();
        boolean answer = ob.writePassword();
        if (answer == true) {
            System.out.println("Password Created Successfully.");
        } else {
            System.out.println("Password Not Created!.");
        }
    }
}
