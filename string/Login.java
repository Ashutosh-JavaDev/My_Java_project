import java.util.Scanner;

class loginPage {
    String Password;
    String Checkpassword;

    public void checkLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password: ");
        while (true) {
            Password = sc.nextLine();
            if (Password.length() > 8 && Password.length() < 17) {
                if (checkUpperLowerCase(Password)) {
                    System.out.print("Enter the Password Again: ");
                    while (true) {
                        Checkpassword = sc.nextLine();
                        if (Password.equals(Checkpassword)) {
                            System.out.println("Password Set Successfully");
                            break;
                        } else {
                            System.out.println("Password Mismatched");
                            continue;
                        }
                    }
                } else {
                    System.out.println("Password Must contains one UpperCase and One LowerCase Character");
                }
                break;
            } else {
                System.out.println("Password must be Have contains 8 to 17 Letters");
                continue;
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
            if (hasLower && hasUpper) {
                return true;
            }
        }
        return false;
    }
}

public class Login {
    public static void main(String[]args){
        loginPage ob=new loginPage();
    }
}
