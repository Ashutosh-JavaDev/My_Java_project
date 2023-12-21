import java.util.*;
public class oddEvenSum {
    public static int add(int arr[],int size){
        int even=0,odd=0;
        if(size<=1){
            return size;
        }
        else if(arr[size-1]%2==0){
            return even+add(arr,size-1); 
        }
        else{
            return odd+add(arr, size-1);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Value");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int answer=add(arr, size);
        System.out.println(answer);
    }
}
