import java.util.Scanner;

class password {

    public static boolean writePassword() {
        boolean result = false;
        String create;
        String newCreate;
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
                System.out.println("Password Contains all the Criteria.");
            } else {
                System.out.println(
                        "Password must Contain a UpperCase, a LowerCase, Numeric Digit, Specific Symbols,should be 8-16 letters.");
            }

        } else {
            System.out.println("Password must contains 8-16 words.");
        }
        System.out.print("Re-Enter Your Password: ");
        newCreate = scc.nextLine();
        if (newCreate.equals(create)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

public class Password {
    public static void main(String[] args) {
        password ob=new password();
        boolean answer=ob.writePassword();
        if(answer==true){
            System.out.println("Password Created Successfully.");
        }
        else{
            System.out.println("Password Not Created!.");
        }
    }
}
