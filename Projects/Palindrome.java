import java.util.Scanner;

class palindrome {
    int number;

    public void num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = sc.nextInt();
        int Number=number;
        while(Number!=0){
            int d=Number%10*10;
            int r=d*10+10;
            Number=Number/10;
        }
        if(Number==number){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is Not  Palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        palindrome ob=new palindrome();
        ob.num();

    }
}
