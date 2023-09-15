package w3school;
import java.util.*;
public class unique{
    public static void unique(int arr[],int size){
        System.out.print("Unique array:");
        for(int i=0;i<size;i++){
              boolean result=false;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j] && i!=j){
                    result=true;
                    break;
                }
            }
            if(result!=true)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the siZe of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        unique(arr, size);
    }
}