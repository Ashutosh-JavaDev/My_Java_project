package w3school;
import java.util.*;
public class reverse {
    public static void reverse(int arr[],int size){
        System.out.println("The reverse array is:");
        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Ente the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,size);
    }
}
