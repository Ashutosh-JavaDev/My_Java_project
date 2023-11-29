package Basic_Java;
import java.util.*;
public class AreaofRectangle {
    public static float result(float height,float breadth){
        float area=0;
        area=height*breadth;
        return area;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of  the Rectangle");
        float len=sc.nextFloat();
        System.out.println("Enter the Breadth of the Rectangle");
        float breadth=sc.nextFloat();
        float Output=result(len,breadth);
        System.out.println("Output:     "+Output);
    }
}
