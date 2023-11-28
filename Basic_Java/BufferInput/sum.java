package Basic_Java.BufferInput;
import java.io.*;
public class sum {
    public static void main(String[]args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(read);
        // System.out.println("Enter First Number");
        // int Sum1=Integer.parseInt(sc.readLine());
        // System.out.println("Enter Second Number");
        // int Sum2=Integer.parseInt(sc.readLine());
        // int Result=Sum1+Sum2;
        // System.out.println("Result  : "+Result);
        int  sum=0;
        System.out.println("Enter The Size of the Array");
        int size=Integer.parseInt(sc.readLine());
        int arr[]=new int[size];
        System.out.println("Enter the value");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(sc.readLine());
        }
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println("Result : "+sum);
    }
}
