import java.util.Scanner;

class loginPage {
    String Password;
    String Checkpassword;
    int len;

    public void check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password: ");
        while (true) {
            Password = sc.nextLine();
            if(Password.length()>8 && Password.length()<17){
                
            }
        }

    }
}

public class Login {

}
