import java.util.*;

public class Maximum {
    public static int check(int arr[],int size,int i){
   
        if(size<=0){
            return 0;
        }
             int max=check(arr, size-1, i+1);
        if(arr[i]>max){
            return arr[i];
        }
        else{
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int output = check(arr, size, 0);
        System.out.println("Max:    "+output);
    }

}
