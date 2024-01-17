import java.util.Scanner;
import java.lang.String;
class asc{
    void disp(String str[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
         size=sc.nextInt();
         str=new String[size];
         for(int i=0;i<size;i++){
            str[i]=sc.nextLine();
         }
    }
    void order(String str[],int size){  
        disp(str, size); 
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
    public static void main(String[] args) {
        asc ob=new asc();
        String str[]=new String[5];
        ob.order(str, 5);
    }
}
