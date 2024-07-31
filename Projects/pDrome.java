import java.util.Scanner;

class palin {
    int number;

    public void num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = sc.nextInt();
        int r=0;
        int Number=number;
        while(Number!=0){
            int d=Number%10;
            r=r*10+d;
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

public class pDrome {
    public static void main(String[] args) {
        palin ob=new palin();
        ob.num();

    }
}
