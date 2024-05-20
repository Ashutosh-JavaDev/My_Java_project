import java.util.Scanner;

class Oddcatching {
    public static void catchodding(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
               even(arr, size);
            }
        }
    }
    public static void even(int arr[],int size){
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
               throw new IllegalArgumentException(arr[i]+" : is odd");
            }
        }
    }
}

public class catchOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Values in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Oddcatching ob=new Oddcatching();
        ob.catchodding(arr, size);
    }
}
