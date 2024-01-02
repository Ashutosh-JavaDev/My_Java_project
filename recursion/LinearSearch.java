import java.util.Scanner;
class recursive{
   static int linear(int arr[],int target,int size){
        if(size<0){
            return -1;
        }
        else if (arr[size-1]==target){

            return size;
        }
        return linear(arr, target, size-1);
    }
}public class LinearSearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    }
}
