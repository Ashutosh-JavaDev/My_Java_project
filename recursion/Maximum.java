import java.util.*;
public class Maximum {
    public static int check(int arr[],int size,int i){
        int max=arr[size-1];
        if(size<=0){
            return 0;
        }
        else if(arr[i]>max){
            return max=arr[i];
        }
        else{
            return check(arr, size-1, i+1);
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int output=check(arr, size, 1);
    }

}
