// Write a Java program to get the majority element from an array of integers containing duplicates.  
package Basic_Java.BufferInput;
import java.io.*;
public class CheckMajorityElement {
    public static void majority(int arr[],int size){
        int Duplicate=0;
        int check=0;
        for(int i=0;i<size;i++){
          for(int j=i+1;j<size;j++){
            if(arr[i]==arr[j]&&i!=j){
                Duplicate++;
                check=Duplicate;
            }
          }
        }
        if(Duplicate>(size%2)){
            System.out.println("One Number is More than Size and the total Outcome is "+check);
        }
        else{
            System.out.println("No Number is  More than Size");
        }
    }
    public static void main(String[]args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(read);
        System.out.println("Enter the size of the Array");
        int size=Integer.parseInt(sc.readLine());
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(sc.readLine());
        }   
        majority(arr, size);
    }
}
