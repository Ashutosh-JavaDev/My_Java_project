/*Write a program in java to find the maximum and minimum elements in an array. */
package w3school;
import java.util.*;
public class min_max {
    public static void min_max(int arr[],int size){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max:    "+max);
        System.out.println("Min:    "+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the  array");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the array elements");
        for(int  i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        min_max(arr,size);
    }
}
