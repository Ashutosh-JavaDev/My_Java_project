/*Arrange the Value in Descending Order by Bubble  Sort*/
package w3school;
import java.util.*;
public class descending {
    public static void descending(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Descending Order");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  the  array");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the  array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        descending(arr, size);
    }
}
