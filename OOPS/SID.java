
//WAP to Search Insert and Delete in java.
import java.util.Scanner;

class ScanningClass {
    private int value;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        value = sc.nextInt();
    }

    public int getvlaue() {
        return value;
    }
}

class Search extends ScanningClass {
    public int search(int arr[], int size) {
        scan();
        int valuetoget = getvlaue();
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == valuetoget) {
                pos = i;
            }
        }
        return pos;

    }
}

class delete extends ScanningClass {
    public void Delete(int arr[], int size) {
        scan();
        int valuetodelete = getvlaue();
        for (int i = 0; i < size; i++) {
            if (arr[i] == valuetodelete) {
                int temp = arr[i];
            }
        }
        System.out.println("Data After Deleted");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class SID {
    public static void main(String[] args) {
        delete del = new delete();
        Search ob = new Search();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
