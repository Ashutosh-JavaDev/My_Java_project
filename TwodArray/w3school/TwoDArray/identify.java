package w3school.TwoDArray;
import java.util.*;
public class identify {
    public static void identify(int arr[][],int size){
        System.out.println("Original Array");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void check(int arr[][],int size){
        int y=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i][j]!=1&&arr[j][i]!=0){
                    y=0;
                    break;
                }
            }
        }
        if(y==1){
            System.out.println("Matrix Is Identify");
        }
        else{
            System.out.println("Matrix is not Identify");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[][]=new int [size][size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        identify(arr, size);
        check(arr, size);
    }
}
