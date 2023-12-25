import java.util.*;
public class ReversePrymid {
    public static void reversePattern(int i,int j){
        if(i>5){
            return;
        }
        if(i>j){
            System.out.print("*");
            reversePattern(i, j+1);
        }
        else{
            System.out.println();
            reversePattern(i+1, 0);
        }
    }    
    public static void main(String[] args) {
        reversePattern(1, 0);
    }
}
