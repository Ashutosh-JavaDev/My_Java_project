/*Write a program in C to merge two arrays of the same size sorted in descending order.*/
package w3school;
import java.util.*;
public class DescendingMerge {
    public static void merge(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void array1(int arr1[],int n){
        merge(arr1, n);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr1[j]<arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
    }

    public static void array2(int arr2[],int z){
        merge(arr2, z);
        for(int i=0;i<z-1;i++){
            for(int j=0;j<z-i-1;j++){
                if(arr2[j]<arr2[j+1]){
                    int temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
       
    }
    public static void mergeArray(int arr4[],int m){
         System.out.println("The First Descending Order array are :");
        for(int i=0;i<m;i++){
            System.out.println(arr4[i]);
        }

         System.out.println("The Second Descending Order array are :");
        for(int i=0;i<m;i++){
            System.out.println(arr4[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        array1(arr, size);
        array2(arr, size);
        mergeArray(arr, size);
    }
}
