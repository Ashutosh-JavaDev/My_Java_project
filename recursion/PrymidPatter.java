import java.util.*;
public class PrymidPatter {
    public static void pattern(int i,int j){
        if(i==j){
            return;
        }
        if(j<i){
            System.out.println("*");
            pattern(i, j+1);
        }
        else{
            System.out.println();
            pattern(i-1, 0);
        }
    }
}
