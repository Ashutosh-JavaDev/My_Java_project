import java.util.*;
public class oddPositiveNumber {
    public static void check(int term,int i){
        if(i>=term){
            System.out.println(i);
            return;
        }
        else{
            System.out.println(i);
            check(term, i+2);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term");
        int term=sc.nextInt();
        check(term, 1);
    }
}
