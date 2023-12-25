import java.util.*;
public class PrymidPatter {
    public static void pattern(int size,int i,int j){
        if(i==size){
            return;
        }
        if(j<i){
            System.out.print("*");
            pattern(size,i, j+1);
        }
        else{
            System.out.println();
            pattern(size,i-1, 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of pattern");
        int size=sc.nextInt();
        pattern(size,size, 0);


    }
}
