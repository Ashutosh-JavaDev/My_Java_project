/*Write a program in C to find the second smallest element in an array.
*/
package w3school;
import java.util.*;
public class second_smallest {
    public static void second_smallest(int arr[],int size){
        int min=arr[0];
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                sec_min=min;
                min=arr[i];
            }
            else if(arr[i]<sec_min&&arr[i]!=min){
                sec_min=arr[i];
            }
        }
        if(sec_min==Integer.MAX_VALUE){
            System.out.println("There is no Second Minimun value");
        }
        else{
            System.out.println("Min:    "+min);
            System.out.println("Second Minimun:     "+sec_min);
        }
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the array elements");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
        second_smallest(arr, size);
   }
}
