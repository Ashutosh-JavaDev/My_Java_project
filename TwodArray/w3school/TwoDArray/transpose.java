package TwodArray.w3school.TwoDArray;
import java.util.*;
public class transpose {
    public static void original(int arr[][],int size){
        System.out.println("Original Matrix");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void  transpose(int arr1[][],int size){
        int trr[][]=new  int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
               trr[j][i]=arr1[i][j] ;
            }
        }
         System.out.println("Transpose Array");
         for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(trr[i][j]);
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  the array");
        int size=sc.nextInt();
        int  arr[][]=new  int [size][size];
        System.out.println("Enter the  array elements");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        original(arr, size);
        transpose(arr, size);
    }
}
