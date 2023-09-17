/*Write a program in Java to sort elements of an array in ascending order.*/
package w3school;
/*Arrange the Value in Ascending Order by Selection  Sort*/
import java.util.*;
public class ascending {
    public static void ascending(int arr[],int size){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Ascending Order");

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the  array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ascending(arr, size);
    }
}
