import java.util.*;
public class BinarySearch {
    public static int search(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        
       if(target==arr[mid]){
            return arr[mid];
        }
        if(target>arr[mid]){
            return search(arr, target, start+1, end);
        }
        else{
            return search(arr, target, start, end-1);
        }
    }    
    public static void main(String[] args) {
        
    }
}
