package w3school;
import java.util.*;
public class PairSum {
    public static void sum(int arr[],int size){
    Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter the Sum, To check the presence of Index");
      int num=sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==num){
                    System.out.println(arr[i]+"+"+arr[j]+"="+num);
                    c++;
                }
            }
        }
        if(c>0){
            System.out.println("Total Value Found: "+c);
        }
        else{
            System.out.println("No Value Found for the Sum");
        }
    }   
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr, size);

    } 
}
