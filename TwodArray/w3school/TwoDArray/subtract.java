package TwodArray.w3school.TwoDArray;
import java.util.*;
public class subtract {
    public static void first(int arr[][],int size,int size1){
        for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void second(int arr[][],int size, int size1){
        for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] third(int arr1[][],int arr2[][],int size,int size1)  {
        int result[][]=new int [size][size1];
        for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
                 result[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        return  result;
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  row of the array");
        int row=sc.nextInt();
        System.out.println("Enter the column of the  array");
        int col=sc.nextInt();
        int one[][]=new int [row][col];
        int two[][]=new int [row][col];
        System.out.println("Enter the firstt array elements");
        for(int  i=0;i<row;i++){
            for(int j=0;j<col;j++){
                one[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value for  second array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                two[i][j]=sc.nextInt();
            }
        }
        System.out.println("First Array");
        first(one, row, col);  
        System.out.println("Seccond  Array");
        second(two, row, col);
        int three[][]=third(one, two, row, col);
        System.out.println("Subtracted array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(three[i][j]+" ");
            }
            System.out.println();
        }
    }
}
