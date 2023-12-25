import java.util.*;
public class Triangle {
    public static void triangle(int i,int j){
        if(i>5){
            return;
        }
        if(i>=2*j-1){
            System.out.print("*"+" ");
            triangle(i, j+1);
        }
        else{
            System.out.println();
            triangle(i+1, j);
        }
    }   
}
