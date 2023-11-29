package Basic_Java;
import java.util.*;
public class AreaofTriangle {
    public static float triangle(float base,float height){
        float area=0;
        area=(float)0.5*base*height;
        return area;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base and Height");
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        float Output=triangle(base, height);
        System.out.println("Output:     "+Output);
    }
}
