package w3school;
import java.util.*;
public class sum {
    public static int total(int arr[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int add=total(arr,size);
        System.out.println("The sum of "+size+" number is: "+add);
    }
}
