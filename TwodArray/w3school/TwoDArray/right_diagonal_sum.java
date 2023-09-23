package w3school.TwoDArray;
import java.util.*;
public class right_diagonal_sum { 
    public static void original(int arr[][],int size){
        System.out.println("Original  Array");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int right(int arr[][],int size){
        int sum=0;
       
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of the Array");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        System.out.println("Enter the Matrix value");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        original(arr, size);    
        int add=right(arr, size);
         System.out.println("Right_Diagonal sum: "+add);
    }
}
