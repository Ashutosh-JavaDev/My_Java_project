import java.util.*;

public class clockwise_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		System.out.println("Enter the rotation count");
		int k=sc.nextInt();
		

		for(int j=0;j<k;j++)
		{
        int temp = arr[size - 1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
		
        arr[0] = temp;
		}
        System.out.println("After rotating the array clockwise:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
