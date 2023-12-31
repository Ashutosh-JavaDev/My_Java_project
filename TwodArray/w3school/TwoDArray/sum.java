package TwodArray.w3school.TwoDArray;
import java.util.*;

public class Sum {
    public static void first(int arr[][], int size, int size1) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void second(int arr[][], int size, int size1) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addArrays(int arr1[][], int arr2[][], int size, int size1) {
        int result[][] = new int[size][size1];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the column size of the array");
        int size1 = sc.nextInt();
        int one[][] = new int[size][size1];
        int two[][] = new int[size][size1];
        System.out.println("Enter the first array elements");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                one[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Second array elements");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                two[i][j] = sc.nextInt();
            }
        }
        System.out.println("First array");
        first(one, size, size1);
        System.out.println("Second Array");
        second(two, size, size1);
        
        int three[][] = addArrays(one, two, size, size1);
        System.out.println("Sum of Array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(three[i][j] + " ");
            }
            System.out.println();
        }
    }
}
