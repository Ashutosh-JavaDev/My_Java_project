package w3school.BinarySearch;
import java.util.*;
public class CountOccurance {
    public static int Countarray(int arr[],int size,int num){
        int f=0,l=size-1;
        while(f<=l){
            int mid=(f+l)/2;
            if(arr[mid]==num){
              return mid;
            }
           else if(arr[mid]<num){
                f=mid+1;
            }
            else{
                l=mid-1;
            }

        }
    }
}
