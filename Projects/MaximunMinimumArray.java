import java.util.Scanner;

class mimMax{
    int size,max=0,min=0;
    public void valuereturn(int arr[]){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    max=arr[i];
                }
                else if(arr[i]<arr[j]){
                    min=arr[i];
                }
            }
        }
    }
}
public class MaximunMinimumArray {   
}
