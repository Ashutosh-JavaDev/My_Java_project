package w3school.TwoDArray;
import java.util.*;
public class  LowerTriangular{
    public static void result(int arr[][],int size){
        System.out.println("Original Matrix");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Lower Triangular");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i>j){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int arr[][]=new int[size][size];
    System.out.println("Enter the array elements");
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        arr[i][j]=sc.nextInt();
        }
    }

    result(arr, size);
}
}