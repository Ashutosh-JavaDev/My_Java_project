import java.util.Scanner;

class loginPage {
    String Password;
    String Checkpassword;
    int len;

    public void checkLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password: ");
        while (true) {
            Password = sc.nextLine();
            if (Password.length() > 8 && Password.length() < 17) {

            }
        }

    }

    public boolean checkUpperLowerCase(String str) {
        boolean hasUpper = false;
        boolean hasLower = false;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }
        return false;
    }
}

public class Login {

}
