import java.util.Scanner;
class findsPairs{
    public static void selectPairs(int arr[],int size,int total){
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==total){
                    System.out.println("arr[ "+i+" ]+ arr[ " +j+ "] = "+total);
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("There is no Paor Found in the Array");
        }
    }
}
public class FindAllPairs {
    
}
