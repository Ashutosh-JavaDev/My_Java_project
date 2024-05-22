import java.util.Scanner;

class sod {
    public static int sum(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }
}public class SumofDigit{
    public static void main(String[]args){
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sod ob=new sod();
        int res=ob.sum(arr, size);
        System.out.println("Result: "+res);
    }
}
