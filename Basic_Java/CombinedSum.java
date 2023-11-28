package Basic_Java;
import java.util.*;
public class CombinedSum {
    public static void Sum(int Number,int size,int arr[]){
        int output=0;
        int c=0;
        // int arr[]=new int[size];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                for(int k=j+1;k<size;k++){
                    for(int l=k+1;l<size;l++){
                        output=arr[i]+arr[j]+arr[k]+arr[l];
                        if(output==Number){
                            System.out.println("Number found");
                            c++;
                        }
                    }
                }
            }
        }
        if(c>0){
            System.out.println("NO Commbintion Found");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Number want to  check the  combination");
        int Number=sc.nextInt();
        Sum(Number,size,arr);
    }
}
