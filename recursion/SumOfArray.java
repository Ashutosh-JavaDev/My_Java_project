import java.util.*;
public class SumOfArray {
    public static int total(int arr[],int size){
        int sum=0;
        if(size==0){
            return 0;
        }
        else{
            sum=sum+arr[size-1];
            return sum+total(arr, size-1);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int answer=total(arr, size);
    }
}
