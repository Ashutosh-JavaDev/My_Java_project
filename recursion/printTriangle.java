import java.util.Scanner;
class Triangle{
    void TrianglePrint(int i,int j){
        if(i>5){
            return;
        }
        else if(i<=5){
            if(j<=i*2-1){
                System.out.print("*");
                TrianglePrint(i, j+1);
                System.out.println();
            }
            else{
                TrianglePrint(i+1, 1);
            }
        }
    }
}public class printTriangle {
    
}
