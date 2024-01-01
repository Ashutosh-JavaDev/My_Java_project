import java.util.Scanner;

class checksort {

    int arrayCheck(int arr[],int size){
                int count=0;

        if(size<0){
            return;
        }
        else{
            if(arr[size-1]>arr[size-2]){
                count++;
             return arrayCheck(arr,size-1);
            }
        }
        if(count == size){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not Sorted");
        }
    }
}

public class CheckArraySory {

}
