import java.util.*;
public class SumOfArray {
    public static int total(int arr[],int size){
        int sum=0;
        if(size==0){
            return 0;
        }
        else{
            sum=sum+arr[size-1];
            return sum+total(arr, size-1);
        }
    }    
    public static void main(String[] args) {
        
    }
}
