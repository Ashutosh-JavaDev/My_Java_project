import java.util.*;

public class MaximumAndMinimum {
   public static int check(int arr[],int size){
    if(size==1){
        return arr[0];
    }
    else{
        return Math.min(arr[size-1], check(arr, size-1)); 
    }
   }     
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the Array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the Value in the Array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(check(arr, size));
   }
}
