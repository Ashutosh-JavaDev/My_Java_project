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
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target value you found in the Array");
        int total=sc.nextInt();
        findsPairs ob=new findsPairs();
        ob.selectPairs(arr, size, total);
    }
}
