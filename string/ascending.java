import java.util.Scanner;
import java.lang.String;
class asc{
    void order(String str[],int size){   
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size-i-1;j++){
                if(str[i]>str[j]){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int i=0;i<size;i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
}
public class ascending {
    
}
