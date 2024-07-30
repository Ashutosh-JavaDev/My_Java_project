import java.util.Scanner;

class PrimeNumber {
    int num;

    public void number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
         num=sc.nextInt();
        int count = 0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime");
        }
    }
}

public class Prime {
    public static void main(String[] args) {
        PrimeNumber ob=new PrimeNumber();
        ob.number();
    }
}
