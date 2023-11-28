package Basic_Java.BufferInput;
import java.io.*;
public class Square {
    public static void  main(String[]args)throws IOException
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader sc=new BufferedReader(read);
    System.out.println("Enter The  Base Value");
    int Base=Integer.parseInt(sc.readLine());
    System.out.println("Enter the Power Value");
    int Power=Integer.parseInt(sc.readLine());
    Double Result=Math.pow(Base,Power);
    System.out.println("Result  : "+Result);
}
}
