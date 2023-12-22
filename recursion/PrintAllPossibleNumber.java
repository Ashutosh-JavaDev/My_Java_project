import java.util.*;
public class PrintAllPossibleNumber {
    public static int possibleOutcome(int arr[],int target,int size,int i,int j){
        if(size<=0){
            return 0;
        }
       if(j<size){
        if(arr[i]+arr[j]==target){
            System.out.println(arr[i]+" + "+arr[j]+" = "+target);
        }
        possibleOutcome(arr, target, size, i, j+1);
       }
       else{
        possibleOutcome(arr, target, size, i+1, i+2);
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
