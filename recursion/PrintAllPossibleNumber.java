import java.util.*;
public class PrintAllPossibleNumber {
    public static int possibleOutcome(int arr[],int target,int size,int i){
        if(size<=0){
            System.out.println(size);
            return 0;
        }
        else if(arr[size-1]+arr[i]==target){
            System.out.println(arr[size-1]+" + "+arr[i]+" = "+target);
            return possibleOutcome(arr, target, size-1, i+1);
        }
        else{
            return possibleOutcome(arr, target, size-1, i+1);
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target Value");
        int target=sc.nextInt();
        int outcome=possibleOutcome(arr, target, size, 1);
    }   
}
