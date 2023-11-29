package Basic_Java.JavaProgram;
import java.util.*;
public class AreaofCircle {
    public static float Circle(float radius){
        float area=0;
        area=(float)3.14*(radius*radius);
        return area;
    }
    public static void mainn(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        float Radius=sc.nextFloat();
        float Output=Circle(Radius);
        System.out.println("Area Of Circle:     "+Output);
    }
}
