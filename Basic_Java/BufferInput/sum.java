package Basic_Java.BufferInput;
import java.io.*;
public class sum {
    public static void main(String[]args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(read);
        System.out.println("Enter First Number");
        int Sum1=Integer.parseInt(sc.readLine());
        System.out.println("Enter Second Number");
        int Sum2=Integer.parseInt(sc.readLine());
        int Result=Sum1+Sum2;
        System.out.println("Result  : "+Result);
    }
}
