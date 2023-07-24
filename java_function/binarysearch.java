package java_function;
import java.util.*;
public class binarysearch {
    public static void binarysearch(int arr[],int  n){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number wants to search");
        int num=sc.nextInt();
        int first=0;
        int count=0;
        int last=n-1;
        while(first<=last)
        {
            int mid =(first+last)/2;
            if(arr[mid]==num){
                count=mid+1;
            }
            else if(arr[mid]<num)
            {
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        if(count>0){
            System.out.println("The number is found");
        }
        else{
            System.out.println("The number is not in the array");
        }
        

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times want to check the array");
        int s=sc.nextInt();
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();
        for(int i=0;i<s;i++){
            int arr1[]=new int [size];
           binarysearch(arr1,size);
        }
        
    }

    
}
