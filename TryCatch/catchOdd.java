import java.util.Scanner;
class Oddcatching{
    public static void catchodding(int arr[],int size){
       for(int i=0;i<size;i++){
        try{
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
       }
    }
}
public class catchOdd {
    
}
