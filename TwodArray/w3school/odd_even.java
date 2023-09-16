/*Write a program in java to separate odd and even integers into separate arrays*/
package w3school;
import java.util.*;
public class odd_even{
    public static void even(int arr[],int size){
        int e=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                e++;
               System.out.print(arr[i]+" ");
            }
        }
        System.out.println("Total Even: "+e);
    }
    public static void odd(int arr[],int size){
        int o=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
                o++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("Total Odd:  "+o);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of  the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\nEven Numbers");
        even(arr, size);
        System.out.println("\nOdd Number");
        odd(arr, size); 
    }
}