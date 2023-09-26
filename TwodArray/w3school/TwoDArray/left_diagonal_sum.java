package w3school.TwoDArray;
import java.util.*;
public class left_diagonal_sum {
    public static void original(int arr[][],int size){
        System.out.println("Orignal Matrix");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int left(int arr[][],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if((i+j)==(size-1)){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ram=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=ram.nextInt();
        int krishna[][]=new int[size][size];
        System.out.println("Enter the size of the array");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                krishna[i][j]=ram.nextInt();
            }
        }
        original(krishna, size);
        int result=left(krishna, size);
        System.out.println("Left_Diagonal Sum: "+result);
    }
}
