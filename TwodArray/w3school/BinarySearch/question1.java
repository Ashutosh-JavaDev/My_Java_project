package w3school.BinarySearch;
import java.util.*;
public class question1 {
    public static int index(int arr[],int size,int target){
        int f=0,l=size-1;
        while(f<=l){
            int mid=(f+l)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the Array Elements in Sorted manner");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("Enter the Target Value Whose Position want to find");
        int target=sc.nextInt();
        int result=index(arr, size, target);
        System.out.println("Target value :"+target+"\nIndex Position :"+result);
    }
}
