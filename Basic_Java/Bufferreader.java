package Basic_Java;
import java.io.*;
public class Bufferreader {
    public static void main(String[]args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(read);
        System.out.println("Enter Roll Number");
        int roll=Integer.parseInt(sc.readLine());

    }
}
