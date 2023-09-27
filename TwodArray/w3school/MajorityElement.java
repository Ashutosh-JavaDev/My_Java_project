package w3school;
import java.util.*;
public class MajorityElement {
    public  static void Majority(int arr[],int size){
        int  c=0,temp=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]&& i!=j){
                 temp=arr[i];
                    c++;
                }
            }
        }
         if(c>(size/2)){
          System.out.println("Value: "+temp);
        }
        else{
            System.out.println("No Majority Elements");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Majority(arr, size);
    }
}
