import java.util.Scanner;

class mimMax {
    int max = 0, min = 0;

    public void valuereturn(int arr[],int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                   
                }  if (arr[i] < arr[j]) {
                    min = arr[i];
                    
                }
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

    }
}

public class MaximunMinimumArray {
    public static void main(String[] args) {
        mimMax ob=new mimMax();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result=ob.valuereturn(arr,size);
        System.out.println("Result max: ");
    }
}
