import java.util.*;
public class PrymidPatter {
    public static void pattern(int i,int j){
        if(i==0){
            return;
        }
        if(j<i){
            System.out.print("*");
            pattern(i, j+1);
        }
        else{
            System.out.println();
            pattern(i-1, 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of pattern");
        int size=sc.nextInt();
        pattern(size, 0);


    }
}
