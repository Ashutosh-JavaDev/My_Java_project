/*Write a program in Java to delete an element at a desired position from an array*/
package w3school;
import java.util.*;
public class delete {
    public static void delete(int arr[],int size,int pos){
        for(int i=0;i<pos-1;i++){
            System.out.println(arr[i]);
        }
        for(int i=pos;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int  size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position of the number want to delete");
        int pos=sc.nextInt();
        System.out.println("Array After deleted");
        delete(arr, size, pos);

    }
}
