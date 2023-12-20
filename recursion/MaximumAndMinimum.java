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
    
   }
}
