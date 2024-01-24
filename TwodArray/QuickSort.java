class quick {
    // Method to perform the partitioning step of QuickSort
    int quickSorting(int arr[], int low, int high) {
        // Choose the last element as the pivot
        int pivot = arr[high];
        // Initialize the index of the smaller element
        int i = low - 1;

        // Traverse through the array
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] < pivot) {
                // Swap arr[i] and arr[j]
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (move pivot to its correct position)
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        // Return the index of the pivot element
        return i;
    }

    // Recursive function to perform QuickSort
    void recursiveQuick(int arr[], int low, int high) {
        // Check if there are more than one element in the array
        if (low < high) {
            // Find the partition index, i.e., arr[recInd] is now at the right place
            int recInd = quickSorting(arr, low, high);

            // Recursively sort the elements before and after the partition index
            recursiveQuick(arr, low, recInd - 1);
            recursiveQuick(arr, recInd + 1, high);
        }
    }
}

// Main class to test QuickSort
public class QuickSort {
    public static void main(String[] args) {
        // Create an instance of the 'quick' class
        quick ob = new quick();
        
        // Input array to be sorted
        int arr[] = {32, 23, 53, 14, 65, 24, 312, 67, 87, 68};
        
        // Get the length of the array
        int n = arr.length;

        // Call the recursiveQuick method to perform QuickSort
        ob.recursiveQuick(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Array After Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
