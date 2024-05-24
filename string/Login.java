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
                if (checkUpperLowerCase(Password)&&containNumber(Password)) {
                    System.out.print("Enter the Password Again: ");
                    while (true) {
                        Checkpassword = sc.nextLine();
                        if (Password.equals(Checkpassword)) {
                            System.out.println("Password Set Successfully");
                            break;
                        } else {
                            System.out.println("Password Mismatched!\nTry Again");
                            continue;
                        }
                    }
                } else {
                    System.out.println("Password Must contains one UpperCase and One LowerCase Character and also Contain Number in it!\nTry Again");

                    continue;
                }
                break;
            } else {
                System.out.println("Password must be Have contains 8 to 17 Letters!\nTry Again");
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
    public boolean containNumber(String str){
        boolean res=false;
        for(char c:str.toCharArray()){
            if(Character.isDigit(c)){
                res=true;
            }
            if(res){
               return true; 
            }
        }
        return false;

    }
    public boolean containSymbol(String str){
        boolean result=false;
        for(char c:str.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return true;
            }
        }
        return false;
    }
}

public class Login {
    public static void main(String[]args){
        loginPage ob=new loginPage();
        ob.checkLength();
    }
}
