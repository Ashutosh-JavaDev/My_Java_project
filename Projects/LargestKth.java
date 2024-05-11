import java.util.Scanner;

class findLargest {
    public static int kValue(int arr[], int size) {
        int pos = 0;
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    pos=i;
                    max = arr[i];
                }
            }
        }
        return pos;
    }
}

public class LargestKth {

}
