package TwodArray.w3school.TwoDArray;
import java.util.*;
public class display{
    public static void display(int arr[][],int size,int size1){
        for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row");
        int size=sc.nextInt();
        System.out.println("Enter the size of the column");
        int size1=sc.nextInt();
        int arr[][]=new int[size][size1];
        System.out.println("Enter the  array elements");
        for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        display(arr, size,size1);
    }
}