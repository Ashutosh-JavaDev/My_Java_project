import java.util.*;
public class PrintNumberSeries{
    public static  void PrintNumber(int size){
        if(size>5){
            return;
        }
        System.out.println(size);
        PrintNumber(size+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintNumber(1);
    }
}