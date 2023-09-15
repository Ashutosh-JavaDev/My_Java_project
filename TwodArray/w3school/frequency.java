package w3school;
import java.util.*;
public class frequency {
    public static void frequency(int arr[],int size){
        int frequency[]=new int[size];;
        for(int i=0;i<size;i++){
            int c=1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    c++;
                   arr[j]=-1;
                }
            }
            if(arr[i]!=-1){
                frequency[i]=c;
            }
        }
          for (int i = 0; i < size; i++) {
            if (frequency[i] > 0) {
                System.out.println(arr[i] + " = " + frequency[i]);
            }
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
        frequency(arr, size);
    }
}
