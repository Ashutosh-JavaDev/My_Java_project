//bubble sort
//package TwodArray;
import java.util.*;
public class bubblesort{
    public static void bubblesort(int arr[],int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the  array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The array after sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times  wants to check the array");
        int s=sc.nextInt();
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        
        for(int i=0;i<s;i++){
           int arr1[]=new int[size];
           bubblesort(arr1,size);
        }
    }
}