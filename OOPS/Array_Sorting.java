import java.util.*;

class bubble {
    int arr[];
    int size;

    public void ascending() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Ascending Order");
        result();
    }

    public void result() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void descending() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Descending Order");
        result();
    }
}

class selection {
    int arr[];
    int size;

    public void ascending() {
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order");
        result();
    }

    public void result() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void descending() {
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending Order");
        result();
    }
}

class input {
    int size;
    int arr[];

    public void value() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

}

public class Array_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bubble Krishna = new bubble();
        selection Ram = new selection();
        input sanatan = new input();
        System.out.println("Enter the size of  the array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        sanatan.size = s;
        sanatan.arr = arr;
        sanatan.value();
        Krishna.size=s;
        Krishna.arr = arr;
        // Ascending value
        Krishna.ascending();
        // Descending Value
        Krishna.descending();
        // Selection Ascending
        Ram.size = s;
        Ram.arr = arr;
        Ram.ascending();
        // Descending Value
        Ram.descending();
    }
}
